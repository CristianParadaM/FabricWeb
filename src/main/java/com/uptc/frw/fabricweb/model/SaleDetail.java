package com.uptc.frw.fabricweb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.uptc.frw.fabricweb.model.key.SaleDetailKey;
import jakarta.persistence.*;

@Entity
@Table(name = "SALES_DETAILS")
public class SaleDetail {

    @EmbeddedId
    private SaleDetailKey id;

    @Column(name = "QUANTITY")
    private int quantity;
    @Column(name = "PRICE")
    private double price;
    @ManyToOne
    @MapsId("saleId")
    @JoinColumn(name = "ID_SALE")
    @JsonIgnore
    private Sale sale;
    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "ID_PRODUCT")
    @JsonIgnore
    private Product product;

    public SaleDetail() {
    }

    public SaleDetail(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public SaleDetailKey getId() {
        return id;
    }

    public void setId(SaleDetailKey id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "SaleDetail{" +
                ", id=" + id +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
