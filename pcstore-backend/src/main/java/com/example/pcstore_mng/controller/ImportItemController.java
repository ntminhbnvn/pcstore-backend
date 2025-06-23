package com.example.pcstore_mng.controller;

import com.example.pcstore_mng.model.ImportItem;
import com.example.pcstore_mng.service.ImportItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/import-items")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class ImportItemController {

    private final ImportItemService itemService;

    @GetMapping
    public ResponseEntity<List<ImportItem>> getAll() {
        return ResponseEntity.ok(itemService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ImportItem> getById(@PathVariable Integer id) {
        return itemService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ImportItem> create(@RequestBody ImportItem item) {
        return ResponseEntity.ok(itemService.create(item));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ImportItem> update(@PathVariable Integer id, @RequestBody ImportItem item) {
        return ResponseEntity.ok(itemService.update(id, item));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        itemService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
