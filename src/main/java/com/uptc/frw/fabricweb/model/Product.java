package com.uptc.frw.fabricweb.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @Column(name = "ID_PRODUCT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ID_PRODUCT_TYPE", insertable = false, updatable = false)
    private long productTypeId;
    @ManyToMany(mappedBy = "productList", cascade = CascadeType.PERSIST)
    private List<Machine> machineList;
    @ManyToOne
    @JoinColumn(name ="ID_PRODUCT_TYPE" )
    private ProductType productType;
    @OneToMany(mappedBy = "product")
    private List<SaleDetail> saleDetailList;

    public Product(long id, String name, String description, long productTypeId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.productTypeId = productTypeId;
    }

    public Product() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(long productTypeId) {
        this.productTypeId = productTypeId;
    }

    public List<Machine> getMachineList() {
        return machineList;
    }

    public void setMachineList(List<Machine> machineList) {
        this.machineList = machineList;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public List<SaleDetail> getSaleDetailList() {
        return saleDetailList;
    }

    public void setSaleDetailList(List<SaleDetail> saleDetailList) {
        this.saleDetailList = saleDetailList;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", productType=" + productTypeId +
                '}';
    }
}
