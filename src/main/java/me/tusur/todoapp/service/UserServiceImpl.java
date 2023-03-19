package me.tusur.todoapp.service;

import lombok.AllArgsConstructor;
import me.tusur.todoapp.entity.User;
import me.tusur.todoapp.exception.EntityNotFoundException;
import me.tusur.todoapp.repository.UserRepository;

import java.util.Optional;

@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        return unwrapUser(user, id);
    }

    @Override
    public User getUser(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        return unwrapUser(user, 404L);
    }

    @Override
    public User saveUser(User user) {
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    static User unwrapUser(Optional<User> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException(id, User.class);
    }

}
