package com.example.login.repo;

import com.example.login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long > {
    Optional<User> findByUsername(String username);
}
