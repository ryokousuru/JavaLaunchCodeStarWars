package com.launchcode.java;

public class Villian implements Character {

    /*
    * Implementing all the methods in the
    * interface causes errors to clear
    * parameters also have to match
    * */

    public String weapon = "some kind of a really big stick";

    public Villian(){
    }
    public String getWeapon(){
        return weapon;
    }

    public void attack(){
        System.out.println("The enemy attacks you!");
    }
    @Override                   //override is optional, but makes it clear
    public void heal(){         //that interface method is being overridden
        System.out.println("The enemy heals himself (or is it herself?)");
    }
    //implemented class can have other
    //methods that aren't in the interface:

    public void drawSword(){
        System.out.println("Drawing the sword from out of the sheath!");
    }
}