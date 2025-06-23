package com.example.pcstore_mng.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "supplier")
@Data
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String phone;
    private String address;
}
