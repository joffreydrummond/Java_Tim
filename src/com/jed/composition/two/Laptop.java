package com.jed.composition.two;

public class Laptop {
    private String model;
    private String brandName;

    public Laptop(String model, String brandName) {
        this.model = model;
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public String getBrandName() {
        return brandName;
    }
}
