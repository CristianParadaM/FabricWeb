package com.uptc.frw.fabricweb.model;

import java.util.Date;

public class Sale {
    private long id;
    private Date saleDate;
    private Date estimateDeliveryDate;
    private Date deliveryDate;
    private Long personId;

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
