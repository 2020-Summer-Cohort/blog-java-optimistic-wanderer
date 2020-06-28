package org.wcci.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {
    private CategoryStorage categoryStorage;
    private AuthorStorage authorStorage;
    private HashtagStorage hashtagStorage;

    public CategoryController(CategoryStorage categoryStorage, AuthorStorage authorStorage, HashtagStorage mockHashtagStorage, HashtagStorage tagStorage) {
        this.categoryStorage = categoryStorage;
        this.authorStorage = authorStorage;
        this.hashtagStorage = hashtagStorage;
    }

}
