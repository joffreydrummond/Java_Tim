package com.jed.composition.two;

public class Main {

  public static void main(String[] args) {
    Bed myBed = new Bed(false, "Serta", true);
    Laptop myLaptop = new Laptop("AX-1000", "Alienware");
    Chair myChair = new Chair("Nice", "black", true);

    Room myRoom = new Room(myChair, myLaptop, myBed);

    myRoom.goToSleep();

    //
  }
}
