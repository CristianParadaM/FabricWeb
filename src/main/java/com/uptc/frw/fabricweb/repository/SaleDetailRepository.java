package com.uptc.frw.fabricweb.repository;

import com.uptc.frw.fabricweb.model.SaleDetail;
import com.uptc.frw.fabricweb.model.key.SaleDetailKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleDetailRepository extends JpaRepository<SaleDetail, SaleDetailKey> { }
