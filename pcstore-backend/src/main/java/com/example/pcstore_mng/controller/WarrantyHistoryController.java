package com.example.pcstore_mng.controller;

import com.example.pcstore_mng.model.WarrantyHistory;
import com.example.pcstore_mng.service.WarrantyHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/warranty")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class WarrantyHistoryController {

    private final WarrantyHistoryService service;

    @GetMapping
    public ResponseEntity<List<WarrantyHistory>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<WarrantyHistory> getById(@PathVariable Integer id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<WarrantyHistory> create(@RequestBody WarrantyHistory history) {
        return ResponseEntity.ok(service.create(history));
    }

    @PutMapping("/{id}")
    public ResponseEntity<WarrantyHistory> update(@PathVariable Integer id, @RequestBody WarrantyHistory history) {
        return ResponseEntity.ok(service.update(id, history));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
