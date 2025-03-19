//package com.example.newsmedia.respository;
//
//import com.example.newsmedia.modals.Article;
//import org.springframework.stereotype.Repository;
//
//import java.util.*;
//
//@Repository
//public class ArticleRepository implements NewsMediaRespositoryOperations {
//    private final Map<String, Article> articles;
//
//
//    public ArticleRepository() {
//        this.articles = new HashMap<>();
//    }
//
//    public String addArticle(Article article) {
//        articles.put(article.getId(), article);
//        return "SUCCESS";
//    }
//    public Optional<Article> deleteArticle(String id) {
//        return Optional.ofNullable(articles.remove(id));
//
//    }
//    public List<Article> fetchAllArticles() {
//        // Fetch all articles
//        List<Article> articleList = new ArrayList<>(articles.values());
//        return  articleList;
//    }
//    public List<Article> fetchArticlesByCategory(String category) {
//        // Fetch articles by category
//        return articles.values().stream()
//                .filter(article->article.getCategory().equals(category)).toList();
//    }
//    public List<Article> fetchArticlesSortedByLikes() {
//        // Fetch articles sorted by likes
//        return articles.values().stream()
//                .sorted(Comparator.comparingInt(Article::getLikes)).toList();
//    }
//
//}
