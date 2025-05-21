package com.uptc.frw.fabricweb.repository;

import com.uptc.frw.fabricweb.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person,Long> {
}
