package me.tusur.todoapp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "users")
@RequiredArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NonNull
    @NotBlank
    @Column(name = "user_name")
    private String name;

    @NonNull
    @NotBlank
    @Email
    @Column(name = "email")
    private String email;

    @NonNull
    @NotBlank
    @Column(name = "password")
    private String password;
}
