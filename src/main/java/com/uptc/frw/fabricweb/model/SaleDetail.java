package com.uptc.frw.fabricweb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SALES_DETAILS")
public class SaleDetail {
    @Id
    @Column(name = "ID_SALE")
    private long productId;
    @Column(name = "ID_PRODUCT")
    private long saleId;
    @Column(name = "QUANTITY")
    private int quantity;
    @Column(name = "PRICE")
    private double price;

    public SaleDetail() {
    }

    public SaleDetail(long productId, long saleId, int quantity, double price) {
        this.productId = productId;
        this.saleId = saleId;
        this.quantity = quantity;
        this.price = price;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getSaleId() {
        return saleId;
    }

    public void setSaleId(long saleId) {
        this.saleId = saleId;
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

    @Override
    public String toString() {
        return "SaleDetail{" +
                "productId=" + productId +
                ", saleId=" + saleId +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
