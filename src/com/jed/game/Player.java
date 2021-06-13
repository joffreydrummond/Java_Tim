package com.jed.game;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public  void loseHealth(int damage){
        this.health = this.health - damage;
    if (this.health <= 0) System.out.println("Player is knocked out...");
    else System.out.println("You took this much damage " + damage + ". Remaining health: " + healthRemaining());
    }

    public int healthRemaining(){
        return this.health;
    }
}
