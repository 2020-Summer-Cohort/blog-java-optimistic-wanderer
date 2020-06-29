package org.wcci.blog;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class ReviewController {

    private ReviewStorage reviewStorage;
    private AuthorRepository authorRepo;
    private HashtagRepository hashtagRepo;
private  ReviewRepository reviewRepo;
private CategoryRepository categoryRepo;
private CategoryStorage categoryStorage;


    @GetMapping("/review/{title}")
    public String showSingleCategory(@PathVariable String title, Model model) {
        model.addAttribute("categories",categoryRepo.findAll());
        model.addAttribute("review", reviewStorage.findByTitle(title));
        model.addAttribute("hashtags",hashtagRepo.findAll());
        return "review-template";
    }
}
// model.addAttribute("title", reviewRepo.findAll());
//        model.addAttribute("address", reviewRepo.findAll());
//        model.addAttribute("distance", reviewRepo.findAll());
//        model.addAttribute("pathType", reviewRepo.findAll());
//        model.addAttribute("difficultyLevel", reviewRepo.findAll());
//        model.addAttribute("mapURL", reviewRepo.findAll());
//        model.addAttribute("postDate", reviewRepo.findAll());
//        model.addAttribute("content", reviewRepo.findAll());
//        model.addAttribute("authors", authorRepo.findAll());
//        model.addAttribute("hashtags", hashtagRepo.findAll());