package me.tusur.todoapp.service;

import me.tusur.todoapp.entity.User;

public interface UserService {
    User getUser(Long id);

    User getUser(String username);

    User saveUser(User user);
}
