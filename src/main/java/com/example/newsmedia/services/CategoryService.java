package com.example.newsmedia.services;

import com.example.newsmedia.daos.CategoryDao;
import com.example.newsmedia.jpaRepos.CategoryRepo;
import com.example.newsmedia.modals.Category;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Primary
@Service
public class CategoryService implements CategoryDao {
    private final CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }
    public Category addCategory(Category category){
        return categoryRepo.save(category);
    }
    public List<Category> fetchAllCategories(){
        return categoryRepo.findAll();
    }
    public void deleteCategory(UUID id){
        categoryRepo.deleteById(id);
    }
    public Category fetchCategoryById(UUID id){
        return categoryRepo.findById(id).orElse(null);
    }
}
