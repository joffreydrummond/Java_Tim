package com.jed.polymorphism.two;

class Car {
  private boolean engine;
  private String name;
  private int cylinders;
  private int wheels;

  public Car(String name, int cylinders) {
    this.engine = true;
    this.name = name;
    this.cylinders = cylinders;
    this.wheels = 4;
  }

  public String startEngine() {
    return "The engine has been started";
  }

  public String accelerate() {
    return "The car is accelerating";
  }

  public String brakeCar() {
    return "The car is slowing down";
  }
}

class Ford extends Car {

  public Ford() {
    super("F-150", 12);
  }

  @Override
  public String startEngine() {
    return "The F-150 engine has started";
  }

  @Override
  public String accelerate() {
    return "The F-150 is accelerating";
  }

  @Override
  public String brakeCar() {
    return "The F-150 is braking";
  }
}

class Honda extends Car {

  public Honda() {
    super("Accord", 6);
  }

  @Override
  public String startEngine() {
    return "The Accord engine has started";
  }

  @Override
  public String accelerate() {
    return "The Accord is accelerating";
  }

  @Override
  public String brakeCar() {
    return "The Accord is braking";
  }
}

class Toyota extends Car {

  public Toyota() {
    super("Camry", 4);
  }

  @Override
  public String startEngine() {
    return "The Camry engine has started";
  }

  @Override
  public String accelerate() {
    return "The Camry is accelerating";
  }

  @Override
  public String brakeCar() {
    return "The Camry is braking";
  }
}

class NoNameCar extends Car {

  public NoNameCar() {
    super("Piece of shit car", 4);
  }

  @Override
  public String startEngine() {
    return "The engine will not start on this POS";
  }

  @Override
  public String accelerate() {
    return "The car isn't even moving dumbass";
  }

  @Override
  public String brakeCar() {
    return "Can't brake what is not even moving";
  }
}

public class Main {
  public static void main(String[] args) {

    for (int i = 1; i < 11; i++) {
      Car car = randomCar();
      assert car != null;
      System.out.println("Car #: " + i + "\n Is the engine started: " + car.startEngine() + "\n Is the car " +
              "accelerating: " + car.accelerate() + "\n Is the car braking: " + car.brakeCar());
    }

    //
  }

  public static Car randomCar() {
    int randomNum = (int) (Math.random() * 5) + 1;
    System.out.println("Random number generated was " + randomNum);

    switch (randomNum){
      case 1:
        return new Ford();
      case 2:
        return new Honda();
      case 3:
        return new Toyota();
         default:
        return new NoNameCar();
    }

  }
}
