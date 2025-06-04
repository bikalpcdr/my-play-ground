package com.bikalp.myplayground.service;

import com.bikalp.myplayground.entity.User;
import com.bikalp.myplayground.repository.UserJpaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserJpaRepository userJpaRepository;

    public UserService(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }


    // JPA operations for saving
    public User saveUser(User user) {
        return userJpaRepository.save(user);
    }

    public User updateUser(User user) {
        return userJpaRepository.save(user);
    }

    public void deleteUser(Long id) {
        userJpaRepository.deleteById(id);
    }

    // JPA operations for fetching
    public List<User> getAllUsers() {
        return userJpaRepository.findAll();
    }

    public User getUserById(Long id) {
        return userJpaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    public User getUserByName(String name) {
        return userJpaRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException("User not found with name: " + name));
    }

    public User getUserByEmail(String email) {
        return userJpaRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found with email: " + email));
    }

    public boolean existsByName(String name) {
        return userJpaRepository.existsByName(name);
    }

    public boolean existsByEmail(String email) {
        return userJpaRepository.existsByEmail(email);
    }
}
