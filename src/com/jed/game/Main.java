package com.jed.game;

public class Main {
  public static void main(String[] args) {
    //
//      Player player = new Player();
//      player.name = "Joffrey";
//      player.health = 20;
//      player.weapon = "Sword";
//
//      int damage = 10;
//      player.loseHealth(damage);
//    player.healthRemaining();
//
//
//      damage = 11;
//      player.loseHealth(damage);
//      player.healthRemaining();

    EnhancedPlayer player = new EnhancedPlayer("Joffrey", 80, "Sword");

    System.out.println("Initial hit points are " + player.getHitPoints());
  }


}
