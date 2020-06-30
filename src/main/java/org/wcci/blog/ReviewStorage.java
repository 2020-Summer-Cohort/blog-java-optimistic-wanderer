package org.wcci.blog;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ReviewStorage {
    ReviewRepository reviewRepo;

    public ReviewStorage(ReviewRepository reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    public Review findByTitle(String title) {
        return reviewRepo.findByTitle(title);
    }
    public Review findByID(long id) {
        return reviewRepo.findById(id).get();
    }

    public void addReview(Review review) {
        reviewRepo.save(review);
    }

    public Iterable<Review> getAllReviews() {
        return reviewRepo.findAll();
    }

    public ReviewRepository getReviewRepo() {
        return reviewRepo;
    }

    public void save(Review review) {
        reviewRepo.save(review);
    }


}
