package com.jed.encapsulation;

public class Main {

  public static void main(String[] args) {
  Printer printer = new Printer(false);

    System.out.println(printer.fillToner(54));
    System.out.println(printer.fillToner(54));
    System.out.println(printer.printPage(75));
    System.out.println(printer.printPage(75));


  }
}
