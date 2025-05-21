package com.uptc.frw.fabricweb.service;

import com.uptc.frw.fabricweb.model.Machine;
import com.uptc.frw.fabricweb.repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineService {
    @Autowired
    private MachineRepository machineRepository;
 
    public List<Machine> findAllMachines() {
        return machineRepository.findAll();
    }
    public Machine getMachineByNumberSerie(Long numberSerie) {
        return machineRepository.findById(numberSerie).orElse(null);
    }

    public Machine saveMachine (Machine machine){
        return machineRepository.save(machine);
    }
    public void deleteMachine(Long numberSerie){
        machineRepository.deleteById(numberSerie);
    }
    public  Machine updateMachine(Machine newMachine){
        Machine machine = getMachineByNumberSerie(newMachine.getNumberSerie());
        machine.setMark(newMachine.getMark());
        machine.setModel(newMachine.getModel());
        machine.setPurchaseDate(newMachine.getPurchaseDate());

        return  machineRepository.save(machine);
    }
}
