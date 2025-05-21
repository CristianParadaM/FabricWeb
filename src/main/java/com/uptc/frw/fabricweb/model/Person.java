package com.uptc.frw.fabricweb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PERSONS")
public class Person {
    @Id
    @Column(name = "ID_PERSON")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "NAMES")
    private String names;
    @Column(name = "LASTNAMES")
    private String lastnames;
    @Column(name = "BIRTHDATE")
    private Date birthdate;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "EMERGENCY_CONTACT_NAME")
    private String emergencyContact;
    @ManyToMany(mappedBy = "personSList" , cascade = CascadeType.PERSIST)
    @JsonIgnore
    private List<Skill> skillList;
    @ManyToMany(mappedBy = "personMList" , cascade = CascadeType.PERSIST)
    @JsonIgnore
    private List<Machine> machinesList;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Sale> salesList;

    public Person() {
    }

    public Person(long id, String names, String lastnames, Date birthdate, String address, String phone, String emergencyContact) {
        this.id = id;
        this.names = names;
        this.lastnames = lastnames;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
        this.emergencyContact = emergencyContact;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastnames() {
        return lastnames;
    }

    public void setLastnames(String lastnames) {
        this.lastnames = lastnames;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public List<Machine> getMachinesList() {
        return machinesList;
    }

    public void setMachinesList(List<Machine> machinesList) {
        this.machinesList = machinesList;
    }

    public List<Sale> getSalesList() {
        return salesList;
    }

    public void setSalesList(List<Sale> salesList) {
        this.salesList = salesList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", lastnames='" + lastnames + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                '}';
    }
}