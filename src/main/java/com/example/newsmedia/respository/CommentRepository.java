//package com.example.newsmedia.respository;
//
//import com.example.newsmedia.modals.Comment;
//import org.springframework.stereotype.Repository;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Repository
//public class CommentRepository implements NewsMediaRespositoryOperations {
//    Map<String, Comment> comments;
//    public CommentRepository() {
//        comments = new HashMap<>();
//    }
//    public String addComment(Comment comment) {
//        comments.put(comment.getId(), comment);
//        return "SUCCESS";
//    }
//    public List<Comment> fetchByArticleId(String articleId) {
//        return comments.values().stream()
//                .filter(comment -> comment.getArticleId().equals(articleId)).toList();
//    }
//}
