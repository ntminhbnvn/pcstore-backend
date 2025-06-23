package com.example.pcstore_mng.repository;

import com.example.pcstore_mng.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
