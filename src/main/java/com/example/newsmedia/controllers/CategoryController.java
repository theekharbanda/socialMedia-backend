package com.example.newsmedia.controllers;

import com.example.newsmedia.exceptions.ResourceNotFoundException;
import com.example.newsmedia.modals.Category;
import com.example.newsmedia.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category category) {
        // Add a category
        return categoryService.addCategory(category);
    }

    @GetMapping("/categories")
    public List<Category> fetchCategories() {
        // Fetch all categories
        return categoryService.fetchAllCategories();
    }

    @DeleteMapping("/categories/{id}")
    public String deleteCategory(@PathVariable String id) throws ResourceNotFoundException {
        // Delete a category
        UUID categoryId = UUID.fromString(id);
        categoryService.deleteCategory(categoryId);
        return "SUCCESS";
    }

}
