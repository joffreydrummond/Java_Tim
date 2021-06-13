package com.jed.poolArea;

public class Cuboid extends Rectangle {
    private double height;

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * height;
    }

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }
}
