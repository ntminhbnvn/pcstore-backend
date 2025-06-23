package com.example.pcstore_mng.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users") // bảng tên là 'users' để tránh xung đột SQL keyword
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String password;
    private String role;
}
