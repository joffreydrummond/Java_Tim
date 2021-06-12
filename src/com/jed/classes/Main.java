package com.jed.classes;

public class Main {
  public static void main(String[] args) {
    //

      Car porsche = new Car();
      Car corvette = new Car();

      porsche.setModel("911");
      corvette.setModel("C8");

    System.out.println("The model of the Porsche is " + porsche.getModel());
    System.out.println("The model of the Corvette is " + corvette.getModel());
  }
}
