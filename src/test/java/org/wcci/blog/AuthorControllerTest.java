package org.wcci.blog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ui.Model;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class AuthorControllerTest {
    private CategoryStorage mockCategoryStorage;
    private AuthorStorage mockAuthorStorage;
    private HashtagStorage mockTagStorage;
    private AuthorController underTest;
    private Model model;

    @BeforeEach
    void setUp() {
        mockCategoryStorage = mock(CategoryStorage.class);
        mockAuthorStorage = mock(AuthorStorage.class);
        mockTagStorage = mock(HashtagStorage.class);
        underTest = new AuthorController(mockCategoryStorage, mockAuthorStorage, mockTagStorage);
        model = Mockito.mock(Model.class);
    }

    @Test
    public void shouldReturnCorrectAuthor() {
        Author testAuthor = new Author("Testy");
        when(mockAuthorStorage.findAuthorByName("Testy")).thenReturn(testAuthor);
        underTest.showSingleAuthor("Testy", model);

        verify(mockAuthorStorage).findAuthorByName("Testy");
        verify(model).addAttribute("author", testAuthor);
    }

    @Test
    public void shouldReturnAuthorTemplate() {
        String returnedTemplate = underTest.showSingleAuthor("Testy", model);
        assertThat(returnedTemplate).isEqualTo("author-template");
    }

    @Test
    public void addsCategoriesTagsAndAuthorsAttributes() {
        ;
        underTest.showSingleAuthor("Testy", model);
        verify(mockCategoryStorage).getAllCategories();
        verify(mockAuthorStorage).getAllAuthors();
        verify(mockTagStorage).getAllHashtags();
        verify(model).addAttribute("categories", Collections.EMPTY_LIST);
        verify(model).addAttribute("tags", Collections.EMPTY_LIST);
        verify(model).addAttribute("authors", Collections.EMPTY_LIST);
        ;
    }
}
