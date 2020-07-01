package org.wcci.blog;

import org.springframework.stereotype.Service;

@Service
public class CategoryStorage {
    private final CategoryRepository categoryRepo;

    public CategoryStorage(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public Category findCategoryByName(String difficultyLevel) {
        return categoryRepo.findByDifficultyLevel(difficultyLevel);
    }

    public void addCategory(Category category) {
        categoryRepo.save(category);
    }

    public Iterable<Category> getAllCategories() {
        return categoryRepo.findAll();
    }
//
//
//    public Category getCategoryByDifficultyLevel(String difficultyLevel) {
//        return categoryRepo.findByDifficultyLevel(difficultyLevel);
//    }

}
