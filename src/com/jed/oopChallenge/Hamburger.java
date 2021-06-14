package com.jed.oopChallenge;

class HealthyBurger extends Hamburger{
  @Override
  public void addLettuce(String lettuce, double lettucePrice) {
    super.addLettuce(lettuce, lettucePrice);
  }

  @Override
  public void addTomato(String tomato, double tomatoPrice) {
    super.addTomato(tomato, tomatoPrice);
  }

  @Override
  public void addOnion(String onion, double onionPrice) {
    super.addOnion(onion, onionPrice);
  }

  @Override
  public void addCheese(String cheese, double cheesePrice) {
    super.addCheese(cheese, cheesePrice);
  }

  public HealthyBurger() {
    super("Vegan Burger", "Gluten Free", "Black Bean Burger", 5.35);

  }
}

class DeluxeBurger extends Hamburger{


  public DeluxeBurger(String name, String breadRollType, String meat, double price) {
    super("Deluxe Burger", "Sourdough", "Two 1/2lb Angus Patties", 7.75);
  }
}


public class Hamburger {
  private String name;
  private String breadRollType;
  private String meat;
  private double meatPrice;
  private double price;

  private String lettuce;
  private double lettucePrice;

  private String tomato;
  private double tomatoPrice;

  private String onion;
  private double onionPrice;

  private String cheese;
  private double cheesePrice;

  public Hamburger(String name, String breadRollType, String meat, double price) {
    this.name = name;
    this.breadRollType = breadRollType;
    this.meat = meat;
    this.price = price;
  }

  public void addLettuce(String lettuce, double lettucePrice) {
    this.lettuce = lettuce;
    this.lettucePrice = lettucePrice;
  }

  public void addTomato(String tomato, double tomatoPrice) {
    this.tomato = tomato;
    this.tomatoPrice = tomatoPrice;
  }

  public void addOnion(String onion, double onionPrice) {
    this.onion = onion;
    this.onionPrice = onionPrice;
  }

  public void addCheese(String cheese, double cheesePrice) {
    this.cheese = cheese;
    this.cheesePrice = cheesePrice;
  }

  public double addItemsToBurger(){
    int totalItems = 0;
    meatPrice = 4.25;
    this.price = meatPrice;
    double burgersPrice = this.price;
    System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll. The current price is " + this.price);

    if (lettuce != null){
      burgersPrice += lettucePrice;
      totalItems++;
      System.out.println("You just added " + lettuce + " which costs $" + lettucePrice + ". \nYour current " +
                "total is $" + burgersPrice + ". \nTotal items added is " + totalItems);
    }
    if (tomato != null){
      burgersPrice += tomatoPrice;
      totalItems++;
      System.out.println("You just added " + tomato + " which costs $" + tomatoPrice + ". \nYour current " +
              "total is $" + burgersPrice + ". \nTotal items added is " + totalItems);
    }
    if (onion != null){
      burgersPrice += onionPrice;
      totalItems++;
      System.out.println("You just added " + onion + " which costs $" + onionPrice + ". \nYour current " +
              "total is $" + burgersPrice + ". \nTotal items added is " + totalItems);
    }
    if (cheese != null){
      burgersPrice += cheesePrice;
      totalItems++;
      System.out.println("You just added " + cheese + " which costs $" + cheesePrice + ". \nYour current " +
              "total is $" + burgersPrice + ". \nTotal items added is " + totalItems);
    }
    return burgersPrice;
  }


//  public double addItems(String itemName) {
//    meatPrice = 4.25;
//
//    double burgersPrice = price;
//    this.price = meatPrice;
//    System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll. The current price is " + burgersPrice);
//    lettuce = "lettuce";
//    lettucePrice = 1.25;
//    tomato = "tomato";
//    tomatoPrice = 1.25;
//    onion = "onion";
//    onionPrice = 1.75;
//    cheese = "cheese";
//    cheesePrice = 2.50;
//
//    int totalItems = 0;
//
//
//
//      if (itemName.equals(lettuce)) {
//        burgersPrice += lettucePrice;
//        totalItems++;
//        System.out.println("You just added " + lettuce + " which costs $" + lettucePrice + ". \nYour current " +
//                "total is $" + burgersPrice + ". \nTotal items added is " + totalItems);
//
//      } else if (itemName.equals(tomato)) {
//        burgersPrice += tomatoPrice;
//        totalItems++;
//        System.out.println("You just added " + tomato + " which costs $" + tomatoPrice + ". \nYour current total is $" + burgersPrice +
//                ". \nTotal items added is " + totalItems);
//      } else if (itemName.equals(onion)) {
//        burgersPrice += onionPrice;
//        totalItems++;
//        System.out.println("You just added " + onion + " which costs $" + onionPrice + ". \nYour current total is $" + burgersPrice + ". \nTotal items added is " + totalItems);
//      } else if (itemName.equals(cheese)) {
//        burgersPrice += cheesePrice;
//        totalItems++;
//        System.out.println("You just added " + cheese + " which costs $" + cheesePrice + ". \nYour current total is $" + burgersPrice + ". \nTotal items added is " + totalItems);
//      }
//
//return burgersPrice;
//  }
}
