package org.wcci.blog;

public class ReviewController {
    private CategoryStorage categoryStorage;
    private AuthorStorage authorStorage;
    private HashtagStorage hashtagStorage;
    private ReviewStorage reviewStorage;

    public ReviewController(CategoryStorage categoryStorage, AuthorStorage authorStorage, Hashtag tagStorage, ReviewStorage reviewStorage) {

        this.categoryStorage = categoryStorage;
        this.authorStorage = authorStorage;
        this.hashtagStorage = hashtagStorage;
        this.reviewStorage = reviewStorage;
    }
}
