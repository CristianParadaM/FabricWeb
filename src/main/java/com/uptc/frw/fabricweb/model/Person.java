package com.uptc.frw.fabricweb.model;

import java.util.Date;

public class Person {
    private int id;
    private String names;
    private String lastnames;
    private Date birthdate;
    private String address;
    private String phone;
    private String emergencyContact;

    public Person() {
    }

    public Person(int id, String names, String lastnames, Date birthdate, String address, String phone, String emergencyContact) {
        this.id = id;
        this.names = names;
        this.lastnames = lastnames;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
        this.emergencyContact = emergencyContact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
