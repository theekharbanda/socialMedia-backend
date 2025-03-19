package com.example.newsmedia.controllers;

import com.example.newsmedia.dtos.ArticleRequest;
import com.example.newsmedia.exceptions.ResourceNotFoundException;
import com.example.newsmedia.modals.Article;
//import com.example.newsmedia.respository.ArticleRepository;
import com.example.newsmedia.modals.Category;
import com.example.newsmedia.modals.User;
import com.example.newsmedia.services.ArticleService;
import com.example.newsmedia.services.CategoryService;
import com.example.newsmedia.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController("/articles")
public class ArticleController {
    private final ArticleService articleService;
    private final CategoryService categoryService;
    private final UserService userService;

    @Autowired
    public ArticleController(ArticleService articleService, CategoryService categoryService, UserService userService) {
        // Constructor
        this.articleService = articleService;
        this.categoryService = categoryService;
        this.userService = userService;
    }




    @PostMapping("/articles")
    public Article createArticle(@RequestBody ArticleRequest articleRequest) throws ResourceNotFoundException {
        // Create an article
        // Fetch category from database
        Category category = categoryService.fetchCategoryById(articleRequest.getCategory());

        // Fetch user from database
        User user = userService.fetchUserById(articleRequest.getUser());

        // Create and save the article
        Article article = new Article();
        article.setTitle(articleRequest.getTitle());
        article.setContent(articleRequest.getContent());
        article.setCategory(category);
        article.setUser(user);
        return articleService.addArticle(article);
    }

    @GetMapping("/articles")
    public List<Article> fetchAllArticles() {
        return  articleService.fetchAllArticles();
    }

    @GetMapping("/articles/category/{name}")
    public List<Article> fetchArticlesByCategory(@PathVariable String name) throws ResourceNotFoundException {
        // Fetch articles by category
        return articleService.getArticleByCategory(name);
    }

    @GetMapping("/articles/sort/likes")
    public List<Article> fetchArticlesSortedByLikes() {
        // Fetch articles sorted by likes
        return articleService.fetchArticlesSortedByLikes();
    }

    @DeleteMapping("/articles/{id}")
    public String deleteArticle(@PathVariable String id) {
        // Attempt to delete the article, throw ResourceNotFoundException if not found
        articleService.deleteArticle(id);
        return "Success";
    }

}
