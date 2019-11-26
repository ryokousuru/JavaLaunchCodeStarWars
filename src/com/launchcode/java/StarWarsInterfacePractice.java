package com.launchcode.java;

import java.util.Random;

public class StarWarsInterfacePractice {

    public static Character callCharacter(){
        Random any = new Random();
        if (Math.abs(any.nextInt()) % 2 == 0){
            return new Villian();
        }else {
            return new Warrior();
        }
    }

    public static void main(String[] args) {
        // write your code here
        Villian thanos = new Villian();
        Warrior capt = new Warrior();
        thanos.attack();
        capt.attack();
        thanos.heal();
        capt.heal();
        System.out.println("Villian weapon: " + thanos.getWeapon());
        System.out.println("Warrior weapon: " + capt.getWeapon());
        Character spy = callCharacter();
        spy.attack();
        spy.heal();
    }
}
