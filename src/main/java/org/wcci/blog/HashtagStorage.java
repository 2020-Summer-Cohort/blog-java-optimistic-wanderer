package org.wcci.blog;

import org.springframework.stereotype.Service;

@Service
public class HashtagStorage {
    HashtagRepository hashtagRepo;

    public HashtagStorage(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }

    public Hashtag getTagByName(String hashtag) {
        return hashtagRepo.findByHashtag(hashtag);
    }

    public Iterable<Hashtag> getAllHashtags() {
        return hashtagRepo.findAll();
    }

    public void addTag(Hashtag hashtag){
        hashtagRepo.save(hashtag);
    }
}
