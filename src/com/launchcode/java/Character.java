package com.launchcode.java;

public interface Character {
    public String base = "character";   //can have properties in an interface, must be public
    public void attack();
    public void heal();
    public String getWeapon();
}
