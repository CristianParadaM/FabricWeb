package com.uptc.frw.fabricweb.model;

import java.util.Date;

public class Machine {
    private String numberSerie;
    private String model;
    private Date purchaseDate;

    public Machine(String numberSerie, String model, Date purchaseDate) {
        this.numberSerie = numberSerie;
        this.model = model;
        this.purchaseDate = purchaseDate;
    }

    public Machine() {}

    public String getNumberSerie() {
        return numberSerie;
    }

    public void setNumberSerie(String numberSerie) {
        this.numberSerie = numberSerie;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "numberSerie='" + numberSerie + '\'' +
                ", model='" + model + '\'' +
                ", purchaseDate=" + purchaseDate +
                '}';
    }
}
