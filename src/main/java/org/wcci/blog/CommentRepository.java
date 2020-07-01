package org.wcci.blog;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {
    Comment findCommentById(Long id);

    Comment findCommentByComment(String comment);
}
