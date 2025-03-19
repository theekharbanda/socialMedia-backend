package com.example.newsmedia.controllers;

import com.example.newsmedia.dtos.CommentRequest;
import com.example.newsmedia.exceptions.ResourceNotFoundException;
import com.example.newsmedia.modals.Article;
import com.example.newsmedia.modals.Comment;
import com.example.newsmedia.modals.User;
import com.example.newsmedia.services.ArticleService;
import com.example.newsmedia.services.CommentService;
import com.example.newsmedia.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController("/comments")
public class CommentController {
    // Controller for comment related operations
    private final CommentService commentService;
    private final ArticleService articleService;
    private final UserService userService;

    public CommentController(CommentService commentService, ArticleService articleService, UserService userService) {
        this.commentService = commentService;
        this.articleService = articleService;
        this.userService = userService;
    }

    @PostMapping("/articles/{id}/comments")
    public Comment addComment(@PathVariable UUID id,  @RequestBody CommentRequest commentRequest) throws ResourceNotFoundException {


        //Retrive article by id
        Article article = articleService.fetchArticleById(id);

        //Retrive user by id
        User user = userService.fetchUserById(commentRequest.getUser());

        // Add a comment
        Comment comment = new Comment();
        comment.setMessage(commentRequest.getMessage());
        comment.setUser(user);
        comment.setArticle(article);

        return commentService.addComment(comment);
    }

    @GetMapping("/articles/{id}/comments")
    public List<Comment> fetchComments(@PathVariable String id) throws ResourceNotFoundException {
        // Fetch all comments
        UUID articleId = UUID.fromString(id);
        return commentService.fetchCommentById(articleId);
    }
}
