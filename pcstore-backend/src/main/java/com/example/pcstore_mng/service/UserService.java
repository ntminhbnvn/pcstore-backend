package com.example.pcstore_mng.service;

import com.example.pcstore_mng.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();
    Optional<User> getById(Integer id);
    User create(User user);
    User update(Integer id, User user);
    void delete(Integer id);
    Optional<User> findByUsername(String username);
}
