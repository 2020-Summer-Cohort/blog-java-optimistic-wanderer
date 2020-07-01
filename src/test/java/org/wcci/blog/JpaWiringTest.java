//package org.wcci.blog;
//
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@DataJpaTest
//public class JpaWiringTest {
//    @Autowired
//    ReviewRepository reviewRepo;
//    @Autowired
//    AuthorRepository authorRepo;
//    @Autowired
//    CategoryRepository categoryRepo;
//    @Autowired
//    HashtagRepository hashtagRepo;
//    @Autowired
//    TestEntityManager entityManager;
//
//    @Test
//    public void postsShouldHaveAnAuthorAndCategoryAndTags() {
//        Author testAuthor = new Author("author name");
//        Category testCategory = new Category("category name");
//        Hashtag testTag = new Hashtag("Tag Name");
//        Review testPost = new Review("Title", "Body", testAuthor, "Publish Date", testCategory, testTag);
//        authorRepo.save(testAuthor);
//        categoryRepo.save(testCategory);
//        hashtagRepo.save(testTag);
//        reviewRepo.save(testPost);
//
//        entityManager.flush();
//        entityManager.clear();
//
//        Author retrievedAuthor = authorRepo.findById(testAuthor.getId()).get();
//        Category retrievedCategory = categoryRepo.findById(testCategory.getId()).get();
//        Hashtag retrievedTag = hashtagRepo.findById(testTag.getId()).get();
//        Review retrievedPost = reviewRepo.findById(testPost.getId()).get();
//        assertThat(retrievedAuthor).isEqualTo(testAuthor);
//        assertThat(retrievedAuthor.getReviews()).containsExactlyInAnyOrder(testPost);
//        assertThat(retrievedCategory).isEqualTo(testCategory);
//        assertThat(retrievedCategory.getReviews()).containsExactlyInAnyOrder(testPost);
//        assertThat(retrievedTag).isEqualTo(testTag);
//        assertThat(retrievedTag.getReviews()).containsExactlyInAnyOrder(testPost);
//        assertThat(retrievedPost).isEqualTo(testPost);
//
//    }
//}
