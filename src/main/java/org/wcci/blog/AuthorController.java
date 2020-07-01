package org.wcci.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private final AuthorStorage authorStorage;

    public AuthorController(AuthorStorage authorStorage) {
        this.authorStorage = authorStorage;
    }

    @RequestMapping("authors")
    public String showAllAuthors(Model model) {
        model.addAttribute("authors", authorStorage.getAllAuthors());
        return "author-list-template";
    }

    @RequestMapping("/author/{name}")
    public String showSingleAuthor(@PathVariable String name, Model model) {
        model.addAttribute("author", authorStorage.findAuthorByName(name));
        model.addAttribute("authors", authorStorage.getAllAuthors());
        return "author-bio-template";
    }
}
