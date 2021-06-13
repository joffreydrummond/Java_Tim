package com.jed.inheritance.two;

public class Car extends Vehicle{

    public Car(String name, int wheel, int door, int body, int engine) {
        super(name, wheel, door, body, engine);
    }



    public void changeGear(int speed){
        System.out.println("Change gear in Car class is called");
        move(speed);

    }


}
