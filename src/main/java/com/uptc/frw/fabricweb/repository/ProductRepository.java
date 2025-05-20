package com.uptc.frw.fabricweb.repository;

import com.uptc.frw.fabricweb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> { }
