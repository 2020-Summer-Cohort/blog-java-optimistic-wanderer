package org.wcci.blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private long id;
    private String comment;
    private String name;
    private String date;
    @ManyToMany(mappedBy = "comments")
    private Collection<Review> reviews;

    protected Comment() {
    }

    public Comment(String comment, String name, String date, Review... reviews) {
        this.comment = comment;
        this.name = name;
        this.date = date;
        this.reviews = new ArrayList<>(Arrays.asList(reviews));
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public String getComment() {
        return comment;
    }

}


