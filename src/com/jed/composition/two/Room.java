package com.jed.composition.two;

public class Room {
Chair chair;
Laptop laptop;
Bed bed;

    public Room(Chair chair, Laptop laptop, Bed bed) {
        this.chair = chair;
        this.laptop = laptop;
        this.bed = bed;
    }

    public Chair getChair() {
        return chair;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public Bed getBed() {
        return bed;
    }

    public void goToSleep(){
        bed.sleep();
    }
}
