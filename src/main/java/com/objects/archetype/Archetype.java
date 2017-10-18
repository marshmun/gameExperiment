package com.objects.archetype;

public class Archetype {

    public Hunter hunter;
    public Mage mage;
    public Theif theif;
    public Warrior warrior;


    public Archetype() {
    }

    public Archetype(Hunter hunter, Mage mage, Theif theif, Warrior warrior) {
        this.hunter = hunter;
        this.mage = mage;
        this.theif = theif;
        this.warrior = warrior;
    }

    public Hunter getHunter() {
        return hunter;
    }

    public void setHunter(Hunter hunter) {
        this.hunter = hunter;
    }

    public Mage getMage() {
        return mage;
    }

    public void setMage(Mage mage) {
        this.mage = mage;
    }

    public Theif getTheif() {
        return theif;
    }

    public void setTheif(Theif theif) {
        this.theif = theif;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }
}
