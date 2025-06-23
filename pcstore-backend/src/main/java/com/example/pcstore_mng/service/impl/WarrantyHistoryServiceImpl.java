package com.example.pcstore_mng.service.impl;

import com.example.pcstore_mng.model.WarrantyHistory;
import com.example.pcstore_mng.repository.WarrantyHistoryRepository;
import com.example.pcstore_mng.service.WarrantyHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WarrantyHistoryServiceImpl implements WarrantyHistoryService {

    private final WarrantyHistoryRepository repository;

    @Override
    public List<WarrantyHistory> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<WarrantyHistory> getById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public WarrantyHistory create(WarrantyHistory warrantyHistory) {
        return repository.save(warrantyHistory);
    }

    @Override
    public WarrantyHistory update(Integer id, WarrantyHistory warrantyHistory) {
        warrantyHistory.setId(id);
        return repository.save(warrantyHistory);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
