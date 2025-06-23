package com.example.pcstore_mng.service;

import com.example.pcstore_mng.model.ImportItem;

import java.util.List;
import java.util.Optional;

public interface ImportItemService {
    List<ImportItem> getAll();
    Optional<ImportItem> getById(Integer id);
    ImportItem create(ImportItem item);
    ImportItem update(Integer id, ImportItem item);
    void delete(Integer id);
}
