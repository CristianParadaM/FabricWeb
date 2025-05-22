package com.uptc.frw.fabricweb.service;

import com.uptc.frw.fabricweb.dto.PersonDTO;
import com.uptc.frw.fabricweb.model.Machine;
import com.uptc.frw.fabricweb.model.Person;
import com.uptc.frw.fabricweb.model.Skill;
import com.uptc.frw.fabricweb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private ProductTypeService productTypeService;
    @Autowired
    private MachineService machineService;
    @Autowired
    private SkillService skillService;

    public List<Person> findAllPersons() {
        return personRepository.findAll();
    }
    public Person getPersonById(Long id){
        return personRepository.findById(id).orElse(null);
    }

    public Person savePerson (PersonDTO person){
        Person insertPerson = new Person(person.getNames(), person.getLastnames(), person.getBirthdate(), person.getAddress(),
                person.getPhone(), person.getEmergencyContact());

        List<Skill> skillsList = new ArrayList<>();
        List<Machine> machineList = new ArrayList<>();

        for (Long id: person.getSkillsIdsList()){
            skillsList.add(skillService.getSkillById(id));
        }

        for (Long id: person.getMachineIdsList()){
            machineList.add(machineService.getMachineByNumberSerie(id));
        }

        insertPerson.setSkillList(skillsList);
        insertPerson.setMachinesList(machineList);

        return personRepository.save(insertPerson);
    }
    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }
    public  Person updatePerson(Long idPerson, PersonDTO newPerson){
        Person person = getPersonById(idPerson);

        person.setNames(newPerson.getNames());
        person.setLastnames(newPerson.getLastnames());
        person.setBirthdate(newPerson.getBirthdate());
        person.setAddress(newPerson.getAddress());
        person.setPhone(newPerson.getPhone());
        person.setEmergencyContact(newPerson.getEmergencyContact());

        List<Skill> skillsList = new ArrayList<>();
        List<Machine> machineList = new ArrayList<>();

        for (Long id: newPerson.getSkillsIdsList()){
            skillsList.add(skillService.getSkillById(id));
        }

        for (Long id: newPerson.getMachineIdsList()){
            machineList.add(machineService.getMachineByNumberSerie(id));
        }

        person.setSkillList(skillsList);
        person.setMachinesList(machineList);
        return  personRepository.save(person);
    }
}