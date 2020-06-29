package org.wcci.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewReviewController {
    private CategoryStorage categoryStorage;
    private AuthorStorage authorStorage;
    private HashtagStorage hashtagStorage;
    private ReviewStorage reviewStorage;
    private ReviewRepository reviewRepo;

    public NewReviewController(CategoryStorage categoryStorage, AuthorStorage authorStorage, HashtagStorage hashtagStorage, ReviewStorage reviewStorage, ReviewRepository reviewRepo) {
        this.categoryStorage = categoryStorage;
        this.authorStorage = authorStorage;
        this.hashtagStorage = hashtagStorage;
        this.reviewStorage = reviewStorage;
        this.reviewRepo = reviewRepo;
    }

    @GetMapping("/new-review/")
    public String newR(Model model) {
        return "new-review-template";
    }

    @PostMapping("review/add")
    public String addReview(String title, String address, Double distance, String pathType, String category, String map, String name, String date, String content) {
        Category thisCategory = categoryStorage.findCategoryByName(category);
        Author thisAuthor = authorStorage.findAuthorByName(name);
        Review reviewToAdd = new Review(title, address, distance, pathType, thisCategory, map, date, content, thisAuthor);

        reviewRepo.save(reviewToAdd);
        reviewToAdd.addReview(reviewToAdd);
        reviewStorage.save(reviewToAdd);
        return "redirect:/categories/";
    }
}