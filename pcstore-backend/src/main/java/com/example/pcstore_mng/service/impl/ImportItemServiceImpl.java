package com.example.pcstore_mng.service.impl;

import com.example.pcstore_mng.model.ImportItem;
import com.example.pcstore_mng.repository.ImportItemRepository;
import com.example.pcstore_mng.service.ImportItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ImportItemServiceImpl implements ImportItemService {

    private final ImportItemRepository repository;

    @Override
    public List<ImportItem> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ImportItem> getById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public ImportItem create(ImportItem item) {
        return repository.save(item);
    }

    @Override
    public ImportItem update(Integer id, ImportItem item) {
        item.setId(id);
        return repository.save(item);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
