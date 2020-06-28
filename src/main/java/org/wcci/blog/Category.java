package org.wcci.blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String difficultyLevel;
    @OneToMany(mappedBy = "category")
    private Collection<Review> reviews;

    protected Category() {
    }

    public Category(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public Long getId() {
        return id;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review reviewToAdd) {
        reviews.add(reviewToAdd);

    }
}
