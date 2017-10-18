package com.objects.player;
import com.objects.archetype.Archetype;
import com.objects.armor.Armor;
import com.objects.Race.Race;
import com.objects.weapons.Weapon;

public class Player {


    public Archetype archetype;
    public Armor armor;
    public Race race;
    public Weapon weapon;

    public Player(Archetype archetype, Armor armor, Race race, Weapon weapon) {
        this.archetype = archetype;
        this.armor = armor;
        this.race = race;
        this.weapon = weapon;
    }

    public Player() {
    }

    public Archetype getArchetype() {
        return archetype;
    }

    public void setArchetype(Archetype archetype) {
        this.archetype = archetype;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
