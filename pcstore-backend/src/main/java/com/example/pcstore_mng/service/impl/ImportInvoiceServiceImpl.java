package com.example.pcstore_mng.service.impl;

import com.example.pcstore_mng.model.ImportInvoice;
import com.example.pcstore_mng.repository.ImportInvoiceRepository;
import com.example.pcstore_mng.service.ImportInvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ImportInvoiceServiceImpl implements ImportInvoiceService {

    private final ImportInvoiceRepository repository;

    @Override
    public List<ImportInvoice> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ImportInvoice> getById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public ImportInvoice create(ImportInvoice invoice) {
        return repository.save(invoice);
    }

    @Override
    public ImportInvoice update(Integer id, ImportInvoice invoice) {
        invoice.setId(id);
        return repository.save(invoice);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
