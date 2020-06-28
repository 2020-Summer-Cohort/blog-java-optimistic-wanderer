package org.wcci.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    private final CategoryStorage campusStorage;
    private final AuthorStorage authorStorage;

    public HomeController(CategoryStorage campusStorage, AuthorStorage authorStorage) {
        this.campusStorage = campusStorage;
        this.authorStorage = authorStorage;
    }

}
