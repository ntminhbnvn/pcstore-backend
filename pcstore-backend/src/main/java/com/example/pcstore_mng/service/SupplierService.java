package com.example.pcstore_mng.service;

import com.example.pcstore_mng.model.Supplier;

import java.util.List;
import java.util.Optional;

public interface SupplierService {
    List<Supplier> getAllSuppliers();
    Optional<Supplier> getSupplierById(Integer id);
    Supplier createSupplier(Supplier supplier);
    Supplier updateSupplier(Integer id, Supplier supplier);
    void deleteSupplier(Integer id);
}
