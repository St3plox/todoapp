package me.tusur.todoapp.service;

import me.tusur.todoapp.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUser(Long id);

    User getUser(String username);

    User saveUser(User user);
}
