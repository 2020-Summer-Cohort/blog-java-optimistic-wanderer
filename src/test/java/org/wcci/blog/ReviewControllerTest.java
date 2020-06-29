package org.wcci.blog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class ReviewControllerTest {}
//    private CategoryStorage mockCategoryStorage;
//    private AuthorStorage mockAuthorStorage;
//    private HashtagStorage mockHashtagStorage;
//    private ReviewRepository underTest;
//    private Model model;
//    private ReviewStorage mockReviewStorage;
//    private HashtagRepository mockreviewStorage;
//    private AuthorRepository mockauthorRepo;
//    private HashtagRepository mockhashtagRepo;
//    private ReviewRepository mockreviewRepo;
//    private CategoryRepository mockcategoryRepo;
//    private CategoryStorage mockcategoryStorage;
//    private AuthorStorage mockauthorStorage;
//
//    @BeforeEach
//    void setUp() {
//        mockCategoryStorage = mock(CategoryStorage.class);
//        mockAuthorStorage = mock(AuthorStorage.class);
//        mockHashtagStorage = mock(HashtagStorage.class);
//        mockReviewStorage = mock(ReviewStorage.class);
//
//        underTest = new ReviewController(mockreviewStorage, mockauthorRepo, mockhashtagRepo, mockreviewRepo, mockcategoryRepo, mockcategoryStorage, mockauthorStorage) {
//
////            model = Mockito.mock(Model.class);
//        }
//
//        @Test
//        public void shouldReturnReviewTemplate () {
//            String templateName = underTest.showSingleCategory("name", model);
//            assertThat(templateName).isEqualTo("review-template");
//        }
//
//        @Test
//        public void shouldAddReviewToModel () {
//            Author testAuthor = new Author("Testy");
//            Category testCategory = new Category("Test Category");
//            Review testReviews = new Review("Test title", "Test address", .1, "dirty", Easy, "nature");
//            when(mockReviewStorage.findByTitle("Test Title")).thenReturn(testReviews);
//            underTest.showSingleCategory("Test Title", model);
//            verify(mockReviewStorage).findByTitle("Test Title");
//            verify(model).addAttribute("post", testReviews);
//        }
//
//        @Test
//        public void addsCategoriesHashTagsAndAuthorsAttributes () {
//            ;
//            underTest.showSingleCategory("Test reviews", model);
//            verify(mockCategoryStorage).getAllCategories();
//            verify(mockAuthorStorage).getAllAuthors();
//            verify(mockHashtagStorage).getAllHashtags();
//            verify(model).addAttribute("categories", Collections.EMPTY_LIST);
//            verify(model).addAttribute("hashtags", Collections.EMPTY_LIST);
//            verify(model).addAttribute("authors", Collections.EMPTY_LIST);
//            ;
//        }
//    }
//}