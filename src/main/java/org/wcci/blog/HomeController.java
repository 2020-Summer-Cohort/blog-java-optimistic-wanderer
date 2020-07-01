package org.wcci.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final HashtagRepository hashtagRepo;
    private final CategoryRepository categoryRepo;
    private final AuthorRepository authorRepo;


    public HomeController(HashtagRepository hashtagRepo, CategoryRepository categoryRepo, AuthorRepository authorRepo) {
        this.hashtagRepo = hashtagRepo;
        this.categoryRepo = categoryRepo;
        this.authorRepo = authorRepo;
    }

    @GetMapping({"", "/"})
    public String XHome(Model model) {
        model.addAttribute("categories", categoryRepo.findAll());
        model.addAttribute("hashtags", hashtagRepo.findAll());
        model.addAttribute("authors", authorRepo.findAll());
        return "home-template";
    }
}
