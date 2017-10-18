package com.objects.weapons;

public class Weapon {

    public Axe axe;
    public Bow bow;
    public Dagger dagger;
    public SpellBook spellBook;
    public Staff staff;
    public Sword sword;
    public TwoHandedSword twoHandedSword;
    public Wand wand;


    public Weapon(Axe axe, Bow bow, Dagger dagger, SpellBook spellBook, Staff staff, Sword sword, TwoHandedSword twoHandedSword, Wand wand) {
        this.axe = axe;
        this.bow = bow;
        this.dagger = dagger;
        this.spellBook = spellBook;
        this.staff = staff;
        this.sword = sword;
        this.twoHandedSword = twoHandedSword;
        this.wand = wand;
    }

    public Weapon() {
    }

    public Axe getAxe() {
        return axe;
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public Bow getBow() {
        return bow;
    }

    public void setBow(Bow bow) {
        this.bow = bow;
    }

    public Dagger getDagger() {
        return dagger;
    }

    public void setDagger(Dagger dagger) {
        this.dagger = dagger;
    }

    public SpellBook getSpellBook() {
        return spellBook;
    }

    public void setSpellBook(SpellBook spellBook) {
        this.spellBook = spellBook;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public TwoHandedSword getTwoHandedSword() {
        return twoHandedSword;
    }

    public void setTwoHandedSword(TwoHandedSword twoHandedSword) {
        this.twoHandedSword = twoHandedSword;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }
}
