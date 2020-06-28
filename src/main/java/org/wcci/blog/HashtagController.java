package org.wcci.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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


}
