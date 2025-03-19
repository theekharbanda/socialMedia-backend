package com.example.newsmedia.daos;

import com.example.newsmedia.exceptions.ResourceNotFoundException;
import com.example.newsmedia.modals.Article;

import java.util.List;
import java.util.UUID;

public interface ArticleDao {
    Article addArticle(Article article);
    List<Article> getArticleByCategory(String name) throws ResourceNotFoundException;
    void deleteArticle(String id);
    List<Article> fetchAllArticles();
    List<Article> fetchArticlesSortedByLikes();
}
