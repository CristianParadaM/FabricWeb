package com.uptc.frw.fabricweb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "MACHINES")
public class Machine {
    @Id
    @Column(name = "SERIE_NUMBER")
    private long numberSerie;
    @Column(name = "MARK")
    private String mark;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "PURCHASE_DATE")
    private Date purchaseDate;
    @ManyToMany(mappedBy = "machinesList")
    @JsonIgnore
    private List<Person> personMList;
    @OneToMany(mappedBy = "machine", cascade = CascadeType.REMOVE)
    private List<ProductType> productTypes;

    public Machine(long numberSerie, String mark, String model, Date purchaseDate) {
        this.numberSerie = numberSerie;
        this.mark = mark;
        this.model = model;
        this.purchaseDate = purchaseDate;
    }

    public Machine() {}

    public long getNumberSerie() {
        return numberSerie;
    }

    public void setNumberSerie(long numberSerie) {
        this.numberSerie = numberSerie;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public List<Person> getPersonMList() {
        return personMList;
    }

    public void setPersonMList(List<Person> personMList) {
        this.personMList = personMList;
    }

    public List<ProductType> getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(List<ProductType> productTypes) {
        this.productTypes = productTypes;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "numberSerie='" + numberSerie + '\'' +
                ", model='" + model + '\'' +
                ", purchaseDate=" + purchaseDate +
                '}';
    }
}