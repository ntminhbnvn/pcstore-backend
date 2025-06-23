package com.example.pcstore_mng.controller;

import com.example.pcstore_mng.model.ImportInvoice;
import com.example.pcstore_mng.service.ImportInvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/import-invoices")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class ImportInvoiceController {

    private final ImportInvoiceService invoiceService;

    @GetMapping
    public ResponseEntity<List<ImportInvoice>> getAll() {
        return ResponseEntity.ok(invoiceService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ImportInvoice> getById(@PathVariable Integer id) {
        return invoiceService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ImportInvoice> create(@RequestBody ImportInvoice invoice) {
        return ResponseEntity.ok(invoiceService.create(invoice));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ImportInvoice> update(@PathVariable Integer id, @RequestBody ImportInvoice invoice) {
        return ResponseEntity.ok(invoiceService.update(id, invoice));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        invoiceService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
