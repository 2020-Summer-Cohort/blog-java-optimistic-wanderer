package org.wcci.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HashtagController {

    private HashtagRepository hashtagRepo;
    private HashtagStorage hashtagStorage;
    private ReviewStorage reviewStorage;
    private CategoryRepository categoryRepo;


    public HashtagController(HashtagRepository hashtagRepo, HashtagStorage hashtagStorage, ReviewStorage reviewStorage, CategoryRepository categoryRepo) {
        this.hashtagRepo = hashtagRepo;
        this.hashtagStorage = hashtagStorage;
        this.reviewStorage = reviewStorage;
        this.categoryRepo = categoryRepo;
    }
    @RequestMapping("hashtag/{hashtag}")
    public String showSingleHashTag(@PathVariable String hashtag, Model model) {
        model.addAttribute("hashtags", hashtagStorage.getAllHashtags());
        model.addAttribute("hashtag", hashtagStorage.findByHashtag(hashtag));
        return "hashtag-template";
    }

    @PostMapping("hashtags/add")
    public String addHashtag(String hashtag, String title) {
        Hashtag hashtagToAdd = hashtagRepo.findByHashtag(hashtag);
        if (hashtagToAdd == null) {
            hashtagToAdd = new Hashtag(hashtag);
            hashtagRepo.save(hashtagToAdd);
        }

        Review review = reviewStorage.findByTitle(title);
        review.addHashtag(hashtagToAdd);
        reviewStorage.save(review);
        return "redirect:/categories/";
    }
}