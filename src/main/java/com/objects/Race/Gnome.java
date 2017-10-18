package com.objects.Race;

public class Gnome{
    public String hitpoints;
    public String magicPoints;
    public String strength;
    public String magicStrength;
    public String trait;
    public String agility;

    public Gnome(String hitpoints, String magicPoints, String strength, String magicStrength, String trait, String agility) {
        this.hitpoints = hitpoints;
        this.magicPoints = magicPoints;
        this.strength = strength;
        this.magicStrength = magicStrength;
        this.trait = trait;
        this.agility = agility;
    }

    public Gnome() {
    }

    public String getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(String hitpoints) {
        this.hitpoints = hitpoints;
    }

    public String getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(String magicPoints) {
        this.magicPoints = magicPoints;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getMagicStrength() {
        return magicStrength;
    }

    public void setMagicStrength(String magicStrength) {
        this.magicStrength = magicStrength;
    }

    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

    public String getAgility() {
        return agility;
    }

    public void setAgility(String agility) {
        this.agility = agility;
    }
}