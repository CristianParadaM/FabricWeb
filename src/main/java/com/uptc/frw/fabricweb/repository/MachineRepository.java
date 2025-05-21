package com.uptc.frw.fabricweb.repository;

import com.uptc.frw.fabricweb.model.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepository extends JpaRepository<Machine,Long> {
   }
