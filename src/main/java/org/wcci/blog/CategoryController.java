package org.wcci.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {
    private CategoryStorage categoryStorage;

    public CategoryController(CategoryStorage categoryStorage) {
        this.categoryStorage = categoryStorage;
    }

    @RequestMapping("categories")
    public String showAllCategories(Model model) {
        model.addAttribute("categories", categoryStorage.getAllCategories());
        return "category-template";
    }
    @RequestMapping("category/{difficultyLevel}")
    public String showSingleCategory(@PathVariable String difficultyLevel, Model model) {
        model.addAttribute("category", categoryStorage.getCategoryByDifficultyLevel(difficultyLevel));
        model.addAttribute("categories", categoryStorage.getAllCategories());
        return "review-template";
    }

}
