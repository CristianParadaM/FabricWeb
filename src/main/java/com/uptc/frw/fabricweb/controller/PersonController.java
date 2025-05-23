package com.uptc.frw.fabricweb.controller;

import com.uptc.frw.fabricweb.dto.PersonDTO;
import com.uptc.frw.fabricweb.model.Person;
import com.uptc.frw.fabricweb.model.Product;
import com.uptc.frw.fabricweb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.findAllPersons();
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable long id) {
        return personService.getPersonById(id);
    }

    @PostMapping
    public Person savePerson(@RequestBody PersonDTO personDTO) {
        return personService.savePerson(personDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable long id) {
        personService.deletePerson(id);
    }

    @PutMapping("/{id}")
    public Person upDatePerson(@PathVariable long id, @RequestBody PersonDTO person) {
        return personService.updatePerson(id, person);
    }
}