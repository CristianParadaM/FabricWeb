package com.uptc.frw.fabricweb.controller;

import com.uptc.frw.fabricweb.model.Material;
import com.uptc.frw.fabricweb.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("materials")
public class MaterialController {
    @Autowired
    private MaterialService materialService;

    @GetMapping
    public List<Material> getAllMaterials() {
        return materialService.findAllMaterials();
    }   

    @GetMapping("/{id}")
    public Material getMaterial(@PathVariable long id) {
        return materialService.getMaterialById(id);
    }

    @PostMapping
    public Material saveMaterial(@RequestBody Material Material) {
        return materialService.saveMaterial(Material);
    }

    @DeleteMapping("/{id}")
    public void deleteMaterial(@PathVariable long id) {
        materialService.deleteMaterial(id);
    }

    @PutMapping
    public Material upDateMaterial(@RequestBody Material Material) {
        return materialService.updateMaterial(Material);
    }
}
