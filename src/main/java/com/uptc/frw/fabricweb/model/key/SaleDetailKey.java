package com.uptc.frw.fabricweb.model.key;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class SaleDetailKey implements Serializable {
    private long productId;
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
}
