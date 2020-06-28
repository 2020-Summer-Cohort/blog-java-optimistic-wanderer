package org.wcci.blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private Long id;
    private String hashtag;
    @ManyToMany(mappedBy = "hashtags")
    private Collection<Review> reviews;

    protected Hashtag() {
    }

    public Hashtag(String hashtag, Review ...reviews) {
        this.hashtag = hashtag;
        this.reviews = new ArrayList<>(Arrays.asList(reviews));
    }

    public Long getId() {
        return id;
    }

    public String getHashtag() {
        return hashtag;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }


}
