package org.wcci.blog;

import org.springframework.stereotype.Service;

@Service
public class HashtagStorage {
    private HashtagRepository hashtagRepo;

    public HashtagStorage(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }

    public Hashtag getTagByName(String hashtag) {
        return hashtagRepo.findByHashtag(hashtag);
    }
    public Hashtag findByHashtag(String hashtag) {
        return hashtagRepo.findByHashtag(hashtag);
    }

    public Iterable<Hashtag> getAllHashtags() {
        return hashtagRepo.findAll();
    }

    public void addTag(Hashtag hashtag){
        hashtagRepo.save(hashtag);
    }
    public void save(Hashtag hashtag) {
        hashtagRepo.save(hashtag);
    }
    public Hashtag findHashtagById(Long id){
        return hashtagRepo.findHashtagById(id);
    }
}
