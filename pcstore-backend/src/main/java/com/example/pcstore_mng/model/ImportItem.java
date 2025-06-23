package com.example.pcstore_mng.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "import_item")
@Data
public class ImportItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantity;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "import_invoice_id")
    private ImportInvoice importInvoice;
}
