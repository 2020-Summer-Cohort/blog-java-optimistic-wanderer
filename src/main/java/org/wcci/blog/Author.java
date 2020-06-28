package org.wcci.blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "authors")
    private Collection<Review> reviews;

    protected Author() {
    }

    public Author(String name) {
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review reviewToAdd) {
        reviews.add(reviewToAdd);

    }

}
