//package com.example.newsmedia.respository;
//
//import com.example.newsmedia.modals.User;
//import org.springframework.stereotype.Repository;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//@Repository
//public class UserRepository implements NewsMediaRespositoryOperations {
//    Map<String, User> userRepo;
//    public UserRepository() {
//        userRepo = new HashMap<>();
//    }
//
//    public String addUser(User user) {
//        userRepo.put(user.getId(), user);
//        return "SUCCESS";
//    }
//    public Optional<User> fetchUserById(String id) {
//        return Optional.ofNullable(userRepo.get(id));
//    }
//    public List<User> fetchAllUsers() {
//        return (List<User>) userRepo.values();
//    }
//    public Optional<User> deleteUser(String id) {
//        return Optional.ofNullable(userRepo.remove(id));
//    }
//
//
//}
