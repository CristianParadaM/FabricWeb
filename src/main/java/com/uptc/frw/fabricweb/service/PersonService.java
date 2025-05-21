package com.uptc.frw.fabricweb.service;

import com.uptc.frw.fabricweb.model.Person;
import com.uptc.frw.fabricweb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private ProductTypeService productTypeService;

    public List<Person> findAllPersons() {
        return personRepository.findAll();
    }
    public Person getPersonById(Long id){
        return personRepository.findById(id).orElse(null);
    }

    public Person savePerson (Person person){
        return personRepository.save(person);
    }
    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }
    public  Person updatePerson(Person newPerson){
        Person person = getPersonById(newPerson.getId());
        person.setNames(newPerson.getNames());
        person.setLastnames(newPerson.getLastnames());
        person.setBirthdate(newPerson.getBirthdate());
        person.setAddress(newPerson.getAddress());
        person.setPhone(newPerson.getPhone());
        person.setEmergencyContact(newPerson.getEmergencyContact());
        return  personRepository.save(person);
    }
}
