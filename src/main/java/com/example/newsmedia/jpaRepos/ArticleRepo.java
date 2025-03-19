package com.example.newsmedia.jpaRepos;

import com.example.newsmedia.modals.Article;
import com.example.newsmedia.modals.Category;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Primary
@Repository
public interface ArticleRepo extends JpaRepository<Article,UUID> {
    List<Article> findAllByOrderByLikesAsc();

    Optional<List<Article>> findByCategoryName(String name);
}