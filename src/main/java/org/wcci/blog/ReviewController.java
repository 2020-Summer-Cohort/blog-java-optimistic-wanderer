package org.wcci.blog;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class ReviewController {

    private ReviewStorage reviewStorage;
    private AuthorRepository authorRepo;
    private HashtagRepository hashtagRepo;
private  ReviewRepository reviewRepo;
private CategoryRepository categoryRepo;
private CategoryStorage categoryStorage;
private AuthorStorage authorStorage;

    public ReviewController(ReviewStorage reviewStorage, AuthorRepository authorRepo, HashtagRepository hashtagRepo, ReviewRepository reviewRepo, CategoryRepository categoryRepo, CategoryStorage categoryStorage, AuthorStorage authorStorage) {
        this.reviewStorage = reviewStorage;
        this.authorRepo = authorRepo;
        this.hashtagRepo = hashtagRepo;
        this.reviewRepo = reviewRepo;
        this.categoryRepo = categoryRepo;
        this.categoryStorage = categoryStorage;
        this.authorStorage = authorStorage;
    }

    @GetMapping("/review/{title}")
    public String showSingleCategory(@PathVariable String title, Model model) {
        model.addAttribute("categories",categoryRepo.findAll());
        model.addAttribute("review", reviewStorage.findByTitle(title));
        model.addAttribute("hashtags",hashtagRepo.findAll());
        return "review-template";
    }

}