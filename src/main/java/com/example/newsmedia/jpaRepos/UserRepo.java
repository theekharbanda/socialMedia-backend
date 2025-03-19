package com.example.newsmedia.jpaRepos;

import com.example.newsmedia.modals.User;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Primary
@Repository
public interface UserRepo  extends JpaRepository<User, UUID> {
    User findByName(String name);
}
