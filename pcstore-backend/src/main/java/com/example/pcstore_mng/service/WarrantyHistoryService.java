package com.example.pcstore_mng.service;

import com.example.pcstore_mng.model.WarrantyHistory;

import java.util.List;
import java.util.Optional;

public interface WarrantyHistoryService {
    List<WarrantyHistory> getAll();
    Optional<WarrantyHistory> getById(Integer id);
    WarrantyHistory create(WarrantyHistory warrantyHistory);
    WarrantyHistory update(Integer id, WarrantyHistory warrantyHistory);
    void delete(Integer id);
}
