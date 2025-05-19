package com.uptc.frw.fabricweb.model;

public class ProcuctType {
    private long id;
    private String productType;
    private String numberSerie;
    private String materialID;

    public ProcuctType(long id, String productType, String numberSerie, String materialID) {
        this.id = id;
        this.productType = productType;
        this.numberSerie = numberSerie;
        this.materialID = materialID;
    }

    public ProcuctType() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getNumberSerie() {
        return numberSerie;
    }

    public void setNumberSerie(String numberSerie) {
        this.numberSerie = numberSerie;
    }

    public String getMaterialID() {
        return materialID;
    }

    public void setMaterialID(String materialID) {
        this.materialID = materialID;
    }

    @Override
    public String toString() {
        return "ProcuctType{" +
                "id=" + id +
                ", productType='" + productType + '\'' +
                ", numberSerie='" + numberSerie + '\'' +
                ", materialID='" + materialID + '\'' +
                '}';
    }
}
