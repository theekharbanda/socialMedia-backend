package com.example.newsmedia.services;

import com.example.newsmedia.daos.ArticleDao;
import com.example.newsmedia.exceptions.ResourceNotFoundException;
import com.example.newsmedia.jpaRepos.ArticleRepo;
import com.example.newsmedia.modals.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Primary
@Service
public class ArticleService implements ArticleDao {

    ArticleRepo articleRepo;

    @Autowired
    public ArticleService(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }

    @Override
    public Article addArticle(Article article) {
        return articleRepo.save(article);
    }

    @Override
    public List<Article> getArticleByCategory(String name) throws ResourceNotFoundException {

        return articleRepo.findByCategoryName(name).orElseThrow(() -> new ResourceNotFoundException("Article not found"));
    }

    @Override
    public void deleteArticle(String id)  {
        UUID articleId = UUID.fromString(id);
        articleRepo.deleteById(articleId);
    }

    @Override
    public List<Article> fetchAllArticles() {
        return articleRepo.findAll();
    }

    @Override
    public List<Article> fetchArticlesSortedByLikes() {
        return articleRepo.findAllByOrderByLikesAsc();
    }

    public Article fetchArticleById(UUID id) throws ResourceNotFoundException {
        return articleRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Article not found"));
    }
}
