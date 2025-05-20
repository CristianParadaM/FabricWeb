package com.uptc.frw.fabricweb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SALES")
public class Sale {
    @Id
    @Column(name = "ID_SALE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "SALE_DATE")
    private Date saleDate;
    @Column(name = "ESTIMATED_DELIVERY_DATE")
    private Date estimateDeliveryDate;
    @Column(name = "DELIVERY_DATE")
    private Date deliveryDate;
    @Column(name = "ID_PERSON", insertable = false, updatable = false)
    private Long personId;
    @ManyToOne
    @JoinColumn(name = "ID_PERSON")
    @JsonIgnore
    private Person person;
    @OneToMany(mappedBy = "sale")
    @JsonIgnore
    private List<SaleDetail> saleDetails;

    public Sale() {
    }

    public Sale(long id, Date saleDate, Date estimateDeliveryDate, Date deliveryDate, Long personId) {
        this.id = id;
        this.saleDate = saleDate;
        this.estimateDeliveryDate = estimateDeliveryDate;
        this.deliveryDate = deliveryDate;
        this.personId = personId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Date getEstimateDeliveryDate() {
        return estimateDeliveryDate;
    }

    public void setEstimateDeliveryDate(Date estimateDeliveryDate) {
        this.estimateDeliveryDate = estimateDeliveryDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<SaleDetail> getSaleDetails() {
        return saleDetails;
    }

    public void setSaleDetails(List<SaleDetail> saleDetails) {
        this.saleDetails = saleDetails;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", saleDate=" + saleDate +
                ", estimateDeliveryDate=" + estimateDeliveryDate +
                ", deliveryDate=" + deliveryDate +
                ", personId=" + personId +
                '}';
    }
}
