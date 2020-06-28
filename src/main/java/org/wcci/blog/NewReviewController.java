package org.wcci.blog;

import org.springframework.stereotype.Controller;

@Controller
public class NewReviewController {
    private CategoryStorage categoryStorage;
    private AuthorStorage authorStorage;
    private HashtagStorage hashtagStorage;
    private ReviewStorage reviewStorage;

    public NewReviewController(CategoryStorage categoryStorage, AuthorStorage authorStorage, HashtagStorage hashtagStorage, ReviewStorage reviewStorage) {
        this.categoryStorage = categoryStorage;
        this.authorStorage = authorStorage;
        this.hashtagStorage = hashtagStorage;
        this.reviewStorage = reviewStorage;
    }
}