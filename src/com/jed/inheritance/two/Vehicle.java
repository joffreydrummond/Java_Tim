package com.jed.inheritance.two;

public class Vehicle {

    private String name;
    private int wheel;
    private int door;
    private int body;
    private int engine;

    private int currentVelocity;
    private int currentDirection;


    public Vehicle(String name, int wheel, int door, int body, int engine) {
        this.name = name;
        this.wheel = wheel;
        this.door = door;
        this.body = body;
        this.engine = engine;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void move(int speed){
    System.out.println("Move in vehicle was called. Vehicle is moving at " + speed + ".");
    }

    public void steering(int direction){
        this.currentDirection += direction;
        System.out.println("Steering in Car class is called. The current direction is " + direction + " degrees.");
    }

}
