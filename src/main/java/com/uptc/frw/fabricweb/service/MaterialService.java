package com.uptc.frw.fabricweb.service;

import com.uptc.frw.fabricweb.model.Material;
import com.uptc.frw.fabricweb.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepository materialRepository;
 
    public List<Material> findAllMaterials() {
        return materialRepository.findAll();
    }
    public Material getMaterialById(Long id){
        return materialRepository.findById(id).orElse(null);
    }

    public Material saveMaterial (Material material){
        return materialRepository.save(material);
    }
    public void deleteMaterial(Long id){
        materialRepository.deleteById(id);
    }
    public  Material updateMaterial(Material newMaterial){
        Material material = getMaterialById(newMaterial.getId());
        material.setName(newMaterial.getName());
        return  materialRepository.save(material);
    }
}
