package org.wcci.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewReviewController {
    private CategoryStorage categoryStorage;
    private AuthorStorage authorStorage;
    private Hashtag hashtagStorage;
    private ReviewStorage reviewStorage;

    public NewReviewController(CategoryStorage categoryStorage, AuthorStorage authorStorage, Hashtag hashtagStorage, ReviewStorage reviewStorage) {
        this.categoryStorage = categoryStorage;
        this.authorStorage = authorStorage;
        this.hashtagStorage = hashtagStorage;
        this.reviewStorage = reviewStorage;
    }
}