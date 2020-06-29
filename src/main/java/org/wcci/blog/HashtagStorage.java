package org.wcci.blog;

import org.springframework.stereotype.Service;

@Service
public class HashtagStorage {
    private final HashtagRepository hashtagRepo;

    public HashtagStorage(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }


    public Hashtag findByHashtag(String hashtag) {
        return hashtagRepo.findByHashtag(hashtag);
    }

    public void addTag(Hashtag hashtag) {
        hashtagRepo.save(hashtag);
    }

    public void save(Hashtag hashtag) {
        hashtagRepo.save(hashtag);
    }

    public Iterable<Hashtag> getAllHashtags() {
        return hashtagRepo.findAll();
    }


}
