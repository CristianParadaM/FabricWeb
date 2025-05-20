package com.uptc.frw.fabricweb.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PRODUCT_TYPES")
public class ProductType {
    @Id
    @Column(name = "ID_PRODUCT_TYPE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "PRODUCT_TYPE")
    private String productType;
    @Column(name = "SERIE_NUMBER", insertable = false, updatable = false)
    private String numberSerie;
    @Column(name = "ID_MATERIAL", insertable = false, updatable = false)
    private String materialID;
    @OneToMany(mappedBy = "productType")
    private List<Product> productList;
    @ManyToOne
    @JoinColumn(name = "SERIE_NUMBER")
    private Machine machine;
    @ManyToOne
    @JoinColumn(name = "ID_MATERIAL")
    private Material material;

    public ProductType(long id, String productType, String numberSerie, String materialID) {
        this.id = id;
        this.productType = productType;
        this.numberSerie = numberSerie;
        this.materialID = materialID;
    }

    public ProductType() {}

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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
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
