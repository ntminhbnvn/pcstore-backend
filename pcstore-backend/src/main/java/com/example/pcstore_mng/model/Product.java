package com.example.pcstore_mng.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "purchase_price")
    private BigDecimal purchasePrice;

    @Column(name = "sale_price")
    private BigDecimal salePrice;

    private int quantity;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "warranty_period")
    private int warrantyPeriod;

    @Column(name = "category_id")
    private Integer categoryId;

}
