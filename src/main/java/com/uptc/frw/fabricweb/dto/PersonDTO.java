package com.uptc.frw.fabricweb.dto;

import java.util.Date;
import java.util.List;

public class PersonDTO {
    private String names;
    private String lastnames;
    private Date birthdate;
    private String address;
    private String phone;
    private String emergencyContact;
    private List<Long> skillsIdsList;
    private List<Long> machineIdsList;

    public PersonDTO(String names, String lastnames, Date birthdate, String address, String phone, String emergencyContact, List<Long> skillsIdsList, List<Long> machineIdsList) {
        this.names = names;
        this.lastnames = lastnames;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
        this.emergencyContact = emergencyContact;
        this.skillsIdsList = skillsIdsList;
        this.machineIdsList = machineIdsList;
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

    public List<Long> getSkillsIdsList() {
        return skillsIdsList;
    }

    public void setSkillsIdsList(List<Long> skillsIdsList) {
        this.skillsIdsList = skillsIdsList;
    }

    public List<Long> getMachineIdsList() {
        return machineIdsList;
    }

    public void setMachineIdsList(List<Long> machineIdsList) {
        this.machineIdsList = machineIdsList;
    }
}
