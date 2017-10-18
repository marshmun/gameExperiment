package com.setupobjects;

import com.objects.weapons.*;

public class SetupWeaponStats {

    public void setupaxestats(){
        Axe axe = new Axe();
        axe.setDamage("7");
        axe.setAgility("6");
        axe.setHealth("7");
        axe.setHitpoints("7");
        axe.setMagicDamage("2");
        axe.setMagicPoints("1");
    }

    public void setupswordstats(){
        Sword sword = new Sword();
        sword.setDamage("7");
        sword.setAgility("7");
        sword.setHealth("6");
        sword.setHitpoints("7");
        sword.setMagicDamage("2");
        sword.setMagicPoints("1");
    }

    public void setupbowstats(){
        Bow bow = new Bow();
        bow.setDamage("7");
        bow.setAgility("7");
        bow.setHealth("4");
        bow.setHitpoints("4");
        bow.setMagicDamage("4");
        bow.setMagicPoints("4");
    }

    public void setupdaggerstats(){
        Dagger dagger = new Dagger();
        dagger.setDamage("4");
        dagger.setAgility("10");
        dagger.setHealth("4");
        dagger.setHitpoints("4");
        dagger.setMagicDamage("4");
        dagger.setMagicPoints("4");
    }

    public void setupspellbookstats(){
        SpellBook spellBook = new SpellBook();
        spellBook.setDamage("0");
        spellBook.setAgility("2");
        spellBook.setHealth("2");
        spellBook.setHitpoints("2");
        spellBook.setMagicDamage("12");
        spellBook.setMagicPoints("12");
    }

    public void setupstaffstats(){
        Staff staff = new Staff();
        staff.setDamage("3");
        staff.setAgility("1");
        staff.setHealth("3");
        staff.setHitpoints("0");
        staff.setMagicDamage("11");
        staff.setMagicPoints("12");
    }

    public void setuptwohanderstats(){
        TwoHandedSword twoHandedSword = new TwoHandedSword();
        twoHandedSword.setDamage("12");
        twoHandedSword.setAgility("0");
        twoHandedSword.setHealth("7");
        twoHandedSword.setHitpoints("6");
        twoHandedSword.setMagicDamage("2");
        twoHandedSword.setMagicPoints("3");
    }

    public void setupwandstats(){
        Wand wand = new Wand();
        wand.setDamage("0");
        wand.setAgility("3");
        wand.setHealth("4");
        wand.setHitpoints("");
        wand.setMagicDamage("12");
        wand.setMagicPoints("11");
    }
}
