package com.uptc.frw.fabricweb.model;

public class Product {
    private long id;
    private String name;
    private String description;
    private long productType;

    public Product(long id, String name, String description, long productType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.productType = productType;
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

    public long getProductType() {
        return productType;
    }

    public void setProductType(long productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", productType=" + productType +
                '}';
    }
}
