package com.example.newsmedia.services;

import com.example.newsmedia.daos.CommentDao;
import com.example.newsmedia.exceptions.ResourceNotFoundException;
import com.example.newsmedia.jpaRepos.CommentRepo;
import com.example.newsmedia.modals.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Primary
@Service
public class CommentService  implements CommentDao {

    private final CommentRepo commentRepo;

    @Autowired
    public CommentService(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }
    public Comment addComment(Comment comment){
        return commentRepo.save(comment);
    }
    public List<Comment> fetchCommentById(UUID id) throws ResourceNotFoundException {
        return commentRepo.findByArticleId(id);
    }
}
