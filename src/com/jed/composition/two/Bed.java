package com.jed.composition.two;

public class Bed {

    private boolean isWater;
    private String name;
    private boolean isComfortable;

    public Bed(boolean isWater, String name, boolean isComfortable) {
        this.isWater = isWater;
        this.name = name;
        this.isComfortable = isComfortable;
    }

    public boolean isWater() {
        return isWater;
    }

    public String getName() {
        return name;
    }

    public boolean isComfortable() {
        return isComfortable;
    }

    public void sleep(){
    System.out.println("I am going to sleep");
    }
}
