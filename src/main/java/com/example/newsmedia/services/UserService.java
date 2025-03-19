package com.example.newsmedia.services;

import com.example.newsmedia.daos.UserDao;
import com.example.newsmedia.exceptions.ResourceNotFoundException;
import com.example.newsmedia.jpaRepos.UserRepo;
import com.example.newsmedia.modals.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService implements UserDao {
    private final UserRepo userRepo;
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    public User addUser(User user){
        return userRepo.save(user);
    }
    public User fetchUserById(UUID id) throws ResourceNotFoundException {
        return userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }
    public List<User> fetchAllUsers(){
        return userRepo.findAll();
    }
    public void deleteUser(UUID id){
        userRepo.deleteById(id);
    }
}
