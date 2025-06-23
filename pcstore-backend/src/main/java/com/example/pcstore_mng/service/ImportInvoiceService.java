package com.example.pcstore_mng.service;

import com.example.pcstore_mng.model.ImportInvoice;

import java.util.List;
import java.util.Optional;

public interface ImportInvoiceService {
    List<ImportInvoice> getAll();
    Optional<ImportInvoice> getById(Integer id);
    ImportInvoice create(ImportInvoice invoice);
    ImportInvoice update(Integer id, ImportInvoice invoice);
    void delete(Integer id);
}
