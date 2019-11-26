package com.launchcode.java;

public class Warrior implements Character {

    public String weapon = "red white and blue shield";

    public void attack(){
        System.out.println("Attacking the mad titan Thanos!");
    }
    public void heal(){
        System.out.println("The hero heals the wounded.");
    }
    public Warrior() {
    }
    public String getWeapon(){
        return weapon;
    }
}
