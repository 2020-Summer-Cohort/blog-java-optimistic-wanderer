//package org.wcci.blog;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.ui.Model;
//
//import java.util.Collections;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.*;
//
//public class CategoryControllerTest {
//
//    private CategoryStorage mockCategoryStorage;
//    private AuthorStorage mockAuthorStorage;
//    private HashtagStorage mockHashtagStorage;
//    private CategoryController underTest;
//    private Model model;
//
//    @BeforeEach
//    void setUp() {
//        mockCategoryStorage = mock(CategoryStorage.class);
//        mockAuthorStorage = mock(AuthorStorage.class);
//        mockHashtagStorage = mock(HashtagStorage.class);
//        underTest = new CategoryController(mockCategoryStorage, mockAuthorStorage, mockHashtagStorage, mockHashtagStorage);
//        model = Mockito.mock(Model.class);
//    }
//
//
//    @Test
//    public void addsCategoriesTagsAndAuthorsAttributes() {
//        ;
//        underTest.showSingleCategory("Test Category", model);
//        verify(mockCategoryStorage).getAllCategories();
//        verify(mockAuthorStorage).getAllAuthors();
//        verify(mockHashtagStorage).getAllHashtags();
//        verify(model).addAttribute("categories", Collections.EMPTY_LIST);
//        verify(model).addAttribute("tags", Collections.EMPTY_LIST);
//        verify(model).addAttribute("authors", Collections.EMPTY_LIST);
//        ;
//    }
//
//    @Test
//    public void shouldReturnCategoryTemplate() {
//        String templateName = underTest.showSingleCategory("Test Category", model);
//        assertThat(templateName).isEqualTo("category-template");
//    }
//
//    @Test
//    public void showSingleCategory() {
//        Category testCategory = new Category("Test Category");
//        when(mockCategoryStorage.findCategoryByName("Test Category")).thenReturn(testCategory);
//        underTest.showSingleCategory("Test Category", model);
//        verify(model).addAttribute("category", testCategory);
//    }
//}
