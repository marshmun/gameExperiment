package com.objects.weapons;

public class Dagger{


    public String hitpoints;
    public String damage;
    public String magicPoints;
    public String magicDamage;
    public String health;
    public String agility;

    public Dagger(String hitpoints, String damage, String magicPoints, String magicDamage, String health, String agility) {
        this.hitpoints = hitpoints;
        this.damage = damage;
        this.magicPoints = magicPoints;
        this.magicDamage = magicDamage;
        this.health = health;
        this.agility = agility;
    }

    public Dagger() {
    }

    public String getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(String hitpoints) {
        this.hitpoints = hitpoints;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(String magicPoints) {
        this.magicPoints = magicPoints;
    }

    public String getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(String magicDamage) {
        this.magicDamage = magicDamage;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getAgility() {
        return agility;
    }

    public void setAgility(String agility) {
        this.agility = agility;
    }
}