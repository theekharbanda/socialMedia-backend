//package com.example.newsmedia.respository;
//
//import com.example.newsmedia.modals.Category;
//import org.springframework.stereotype.Repository;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//@Repository
//public class CategoryRepository implements NewsMediaRespositoryOperations {
//    Map<String, Category> categories;
//    public CategoryRepository() {
//        categories = new HashMap<>();
//    }
//    public String addCategory(Category category) {
//        categories.put(category.getId(), category);
//        return "SUCCESS";
//    }
//    public List<Category> fetchAllCategories() {
//        return (List<Category>) categories.values();
//    }
//    public Optional<Category> deleteCategory(String id) {
//        return Optional.ofNullable(categories.remove(id));
//    }
//}
