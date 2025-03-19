package com.example.newsmedia.jpaRepos;

import com.example.newsmedia.modals.Category;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Primary
@Repository
public interface CategoryRepo  extends JpaRepository<Category, UUID> {
}
