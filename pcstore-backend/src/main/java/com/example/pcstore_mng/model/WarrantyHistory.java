package com.example.pcstore_mng.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "warranty_history")
@Data
public class WarrantyHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String customerName;
    private String phone;
    private String description;

    private LocalDate receivedDate;
    private LocalDate returnDate;

    private String status;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
