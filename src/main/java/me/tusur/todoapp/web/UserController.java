package me.tusur.todoapp.web;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import me.tusur.todoapp.entity.User;
import me.tusur.todoapp.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<String> findById(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUser(id).getUsername(), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<HttpStatus> createUser(@Valid @RequestBody User user) {
        userService.saveUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
