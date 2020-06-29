package org.wcci.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    AuthorRepository authorRepo;
    @Autowired
    CategoryRepository categoryRepo;
    @Autowired
    ReviewRepository reviewRepo;
    @Autowired
    HashtagRepository hashtagRepo;


    @Override
    public void run(String... args) throws Exception {
        Category easy = new Category("Easy");
        Category moderate = new Category("Moderate");
        Category hard = new Category("Hard");
        categoryRepo.save(easy);
        categoryRepo.save(moderate);
        categoryRepo.save(hard);

        Author author1 = new Author("Christin");
        Author author2 = new Author("Cathy");
        authorRepo.save(author1);
        authorRepo.save(author2);


        Hashtag nature = new Hashtag("Nature");
        Hashtag hiking = new Hashtag("Hiking");
        hashtagRepo.save(nature);
        hashtagRepo.save(hiking);

        Review review1 = new Review("Indian Run Falls", "700 Shawan Falls Dr, Dublin, OH 43017",0.8,"Dirt",easy,"https://raw.githubusercontent.com/2020-Summer-Cohort/blog-java-optimistic-wanderer/master/src/main/resources/static/images/indian%20run%20falls.jpeg","6/20/20", "This is a great little trail o get your family out of the house", author1, hiking);
        Review review2 = new Review("Cedar Falls", "19852 OH-664, Logan, OH 43138", 0.5, "Dirt",hard,"https://raw.githubusercontent.com/2020-Summer-Cohort/blog-java-optimistic-wanderer/master/src/main/resources/static/images/cedar_falls_map.gif","6/21/20", "This hike was hard for my 65 year old parents.",author2,nature);
        Review review3 = new Review("Highbanks Metro Park", "9466 Columbus Pike, Lewis Center, OH 43035", 1.0, "Paved",moderate,"https://raw.githubusercontent.com/2020-Summer-Cohort/blog-java-optimistic-wanderer/master/src/main/resources/static/images/highbanks.jpg","6/23/20", "My family and I hike here once a season. great trail for young kids.",author2,nature,hiking);
        reviewRepo.save(review2);
        reviewRepo.save(review1);
        reviewRepo.save(review3);


    }
}
