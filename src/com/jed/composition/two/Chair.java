package com.jed.composition.two;

public class Chair {
    private String brand;
    private String color;
    private boolean canRoll;

    public Chair(String brand, String color, boolean canRoll) {
        this.brand = brand;
        this.color = color;
        this.canRoll = canRoll;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public boolean isCanRoll() {
        return canRoll;
    }
}
