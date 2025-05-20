package com.uptc.frw.fabricweb.model.key;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class SaleDetailKey implements Serializable {
    @Column(name = "ID_PRODUCT", insertable=false, updatable=false)
    private long productId;
    @Column(name = "ID_SALE", insertable=false, updatable=false)
    private long saleId;

    public SaleDetailKey() {}

    public SaleDetailKey(long productId, long saleId) {
        this.productId = productId;
        this.saleId = saleId;
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

    @Override
    public String toString() {
        return "SaleDetailKey{" +
                "productId=" + productId +
                ", saleId=" + saleId +
                '}';
    }
}
