package com.uptc.frw.fabricweb.controller;

import com.uptc.frw.fabricweb.model.Machine;
import com.uptc.frw.fabricweb.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("machines")
public class MachineController {
    @Autowired
    private MachineService machineService;

    @GetMapping
    public List<Machine> getAllMachines() {
        return machineService.findAllMachines();
    }   

    @GetMapping("/{id}")
    public Machine getMachine(@PathVariable long id) {
        return machineService.getMachineByNumberSerie(id);
    }

    @PostMapping
    public Machine saveMachine(@RequestBody Machine Machine) {
        return machineService.saveMachine(Machine);
    }

    @DeleteMapping("/{id}")
    public void deleteMachine(@PathVariable long id) {
        machineService.deleteMachine(id);
    }

    @PutMapping
    public Machine upDateMachine(@RequestBody Machine Machine) {
        return machineService.updateMachine(Machine);
    }
}
