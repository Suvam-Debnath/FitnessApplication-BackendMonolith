package com.sd.fitness.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String email;
    private String  password;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
