package com.uptc.frw.fabricweb.controller;

import com.uptc.frw.fabricweb.model.Skill;
import com.uptc.frw.fabricweb.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skills")
public class SkillController {
    @Autowired
    private SkillService skillService;

    @GetMapping
    public List<Skill> getAllSkills() {
        return skillService.findAllSkills();
    }   

    @GetMapping("/{id}")
    public Skill getSkill(@PathVariable long id) {
        return skillService.getSkillById(id);
    }

    @PostMapping
    public Skill saveSkill(@RequestBody Skill skill) {
        return skillService.saveSkill(skill);
    }

    @DeleteMapping("/{id}")
    public void deleteSkill(@PathVariable long id) {
        skillService.deleteSkill(id);
    }

    @PutMapping
    public Skill upDateSkill(@RequestBody Skill skill) {
        return skillService.updateSkill(skill);
    }
}
