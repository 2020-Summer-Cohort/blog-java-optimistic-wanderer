package org.wcci.blog;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String address;
    private Double distance;
    private String pathType;
    //    private String difficultyLevel;
    private String mapURL;
    private String postedDate;
    @Column(length = 2000000000)
    private String content;
    @ManyToOne
    private Author authors;
    @ManyToOne
    private Category category;
    @ManyToMany
    private Collection<Hashtag> hashtags;
    @ManyToMany
    private Collection<Comment> comments;

    protected Review() {
    }

    public Review(String title, String address, Double distance, String pathType, Category category, String mapURL, String postedDate, String content, Author authors, Hashtag... hashtags) {
        this.title = title;
        this.address = address;
        this.distance = distance;
        this.pathType = pathType;
        this.category = category;
        this.mapURL = mapURL;
        this.postedDate = postedDate;
        this.content = content;
        this.authors = authors;
        this.hashtags = new ArrayList<>(Arrays.asList(hashtags));
    }

    public Category getCategory() {
        return category;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public Double getDistance() {
        return distance;
    }

    public String getPathType() {
        return pathType;
    }


    public String getMapURL() {
        return mapURL;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public String getContent() {
        return content;
    }

    public Author getAuthors() {
        return authors;
    }

    public Collection<Comment> getComments() {
        return comments;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }

    public void addHashtag(Hashtag hashtagToAdd) {
        hashtags.add(hashtagToAdd);
    }

    public void addComment(Comment commentToAdd) {
        comments.add(commentToAdd);
    }

    public void addReview(Review reviewToAdd) {
    }
}