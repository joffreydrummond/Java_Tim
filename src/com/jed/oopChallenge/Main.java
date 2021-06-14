package com.jed.oopChallenge;

public class Main {
  public static void main(String[] args) {
Hamburger burger = new Hamburger("Joffrey Burger", "Sourdough", "Roast Beef", 3.57);
double price = burger.addItemsToBurger();
burger.addCheese("Cheese", 1.25);
burger.addLettuce("Lettuce", 1.00);
    price = burger.addItemsToBurger();

  }
}
