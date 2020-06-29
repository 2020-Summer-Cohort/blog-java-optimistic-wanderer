package org.wcci.blog;

import org.springframework.stereotype.Service;

@Service
public class CommentStorage {
    private CommentRepository commentRepo;

    public CommentStorage(CommentRepository commentRepo) {
        this.commentRepo = commentRepo;
    }

    public Iterable<Comment> getComment() {
        return commentRepo.findAll();
    }

    public Comment findCommentByComment(String comment) {
        return commentRepo.findCommentByComment(comment);
    }

    public void save(Comment comment) {
        commentRepo.save(comment);
    }

    public Comment findCommentById(Long id) {
        return commentRepo.findCommentById(id);
    }

}
