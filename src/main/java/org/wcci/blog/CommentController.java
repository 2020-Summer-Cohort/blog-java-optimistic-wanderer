package org.wcci.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CommentController {
    private CommentRepository commentRepo;
    private CommentStorage commentStorage;
    private CategoryRepository categoryRepo;
    private ReviewStorage reviewStorage;


    public CommentController(CommentRepository commentRepo, CommentStorage commentStorage, CategoryRepository categoryRepo, ReviewStorage reviewStorage) {
        this.commentRepo = commentRepo;
        this.commentStorage = commentStorage;
        this.categoryRepo = categoryRepo;
        this.reviewStorage = reviewStorage;
    }

    @RequestMapping("comment/{comment}")
    public String showSingleComment(@PathVariable String comment, Model model) {
        model.addAttribute("categories",categoryRepo.findAll());
        model.addAttribute("comment", commentStorage.findCommentByComment(comment));
        return "review-template";
    }

    @PostMapping("comments/add")
    public String addComment(String comment, String name, String date, String title) {
        Comment commentToAdd = new Comment(comment, name, date);
        commentRepo.save(commentToAdd);
        Review review = reviewStorage.findByTitle(title);
        review.addComment(commentToAdd);
        reviewStorage.save(review);
        return "redirect:/categories/";
    }
    @GetMapping("comment/{id}")
    public String showSingleComment(@PathVariable Long id, Model model) {
        model.addAttribute("comment", commentRepo.findById(id).get());
        model.addAttribute("comment1", commentRepo.findById(id).get());
        model.addAttribute("comment2", commentRepo.findById(id).get());

        return "review-template";
    }
}

