package com.uptc.frw.fabricweb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private long numberSerie;
    @Column(name = "ID_MATERIAL", insertable = false, updatable = false)
    private long materialID;
    @JsonIgnore
    @OneToMany(mappedBy = "productType", cascade = CascadeType.REMOVE)
    private List<Product> productList;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "SERIE_NUMBER")
    private Machine machine;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "ID_MATERIAL")
    private Material material;

    public ProductType(long id, String productType, long numberSerie, long materialID) {
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

    public long getNumberSerie() {
        return numberSerie;
    }

    public void setNumberSerie(long numberSerie) {
        this.numberSerie = numberSerie;
    }

    public long getMaterialID() {
        return materialID;
    }

    public void setMaterialID(long materialID) {
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
