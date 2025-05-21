package com.uptc.frw.fabricweb.service;

import com.uptc.frw.fabricweb.model.Skill;
import com.uptc.frw.fabricweb.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;
 
    public List<Skill> findAllSkills() {
        return skillRepository.findAll();
    }
    public Skill getSkillById(Long id){
        return skillRepository.findById(id).orElse(null);
    }

    public Skill saveSkill (Skill skill){
        return skillRepository.save(skill);
    }
    public void deleteSkill(Long id){
        skillRepository.deleteById(id);
    }
    public  Skill updateSkill(Skill newSkill){
        Skill skill = getSkillById(newSkill.getId());
        skill.setName(newSkill.getName());
        skill.setDescription(newSkill.getDescription());
        return  skillRepository.save(skill);
    }
}
