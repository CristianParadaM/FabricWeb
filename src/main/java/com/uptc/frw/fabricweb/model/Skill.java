package com.uptc.frw.fabricweb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "SKILLS")
public class Skill {
    @Id
    @Column(name = "ID_SKILL")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "NAME_SKILL")
    private String name;
    @Column(name = "DESCRIPTION_SKILL")
    private String description;
    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name="PERSONS_SKILLS",
            joinColumns = @JoinColumn(name="ID_SKILL"),
            inverseJoinColumns =@JoinColumn(name = "ID_PERSONA")
    )
    private List<Person> personSList;

    public Skill() {}

    public Skill(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Person> getPersonSList() {
        return personSList;
    }

    public void setPersonSList(List<Person> personSList) {
        this.personSList = personSList;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}