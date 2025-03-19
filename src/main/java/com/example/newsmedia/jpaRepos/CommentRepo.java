package com.example.newsmedia.jpaRepos;

import com.example.newsmedia.modals.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Primary
@Repository
public interface CommentRepo  extends JpaRepository<Comment, UUID> {
    List<Comment> findByArticleId(UUID articleId);

}
