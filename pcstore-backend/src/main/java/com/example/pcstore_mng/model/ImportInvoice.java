package com.example.pcstore_mng.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "import_invoice")
@Data
public class ImportInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate importDate;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    private String note;
}
