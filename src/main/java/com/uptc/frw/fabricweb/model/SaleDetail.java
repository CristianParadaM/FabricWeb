package com.uptc.frw.fabricweb.model;

import com.uptc.frw.fabricweb.model.key.SaleDetailKey;
import jakarta.persistence.*;

@Entity
@Table(name = "SALES_DETAILS")
@IdClass(SaleDetailKey.class)
public class SaleDetail {
    @Id
    @Column(name = "ID_SALE", insertable = false, updatable = false)
    private long saleId;
    @Column(name = "ID_PRODUCT", insertable = false, updatable = false)
    private long productId;
    @Column(name = "QUANTITY")
    private int quantity;
    @Column(name = "PRICE")
    private double price;
    @ManyToOne
    @JoinColumn(name = "ID_SALE")
    private Sale sale;
    @ManyToOne
    @JoinColumn(name = "ID_PRODUCT")
    private Product product;

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
                "productId=" + productId +
                ", saleId=" + saleId +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
