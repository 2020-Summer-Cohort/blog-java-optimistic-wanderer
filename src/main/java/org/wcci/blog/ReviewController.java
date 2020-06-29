package org.wcci.blog;

        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;

public class ReviewController {
    private CategoryRepository categoryRepo;
    private AuthorRepository authorRepo;
    private HashtagRepository hashtagRepo;
    private ReviewRepository reviewRepo;


    @RequestMapping("category/{difficultyLevel}")
    public String showSingleCategory(@PathVariable String difficultyLevel, Model model) {
        model.addAttribute("title", reviewRepo.findAll());
        model.addAttribute("address", reviewRepo.findAll());
        model.addAttribute("distance", reviewRepo.findAll());
        model.addAttribute("pathType", reviewRepo.findAll());
        model.addAttribute("difficultyLevel", categoryRepo.findAll());
        model.addAttribute("mapURL", reviewRepo.findAll());
        model.addAttribute("postDate", reviewRepo.findAll());
        model.addAttribute("content", reviewRepo.findAll());
        model.addAttribute("authors", authorRepo.findAll());
        model.addAttribute("hashtags", hashtagRepo.findAll());
        return "review-template";
    }
}