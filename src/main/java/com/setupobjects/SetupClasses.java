package com.setupobjects;

import com.objects.archetype.Hunter;
import com.objects.archetype.Mage;
import com.objects.archetype.Theif;
import com.objects.archetype.Warrior;

public class SetupClasses {
    private void setuphunterstats() {
        Hunter hunter = new Hunter();
        hunter.setStrength("5");
        hunter.setAbility("heaven of arrows");
        hunter.setAgilityPoints("7");
        hunter.setMagicStrength("4");

        hunter.setHealthPoints("7");
        hunter.setMagicPoints("10");
    }

    private void setupmagestats(){
        Mage mage = new Mage();
        mage.setMagicStrength("2");
        mage.setAbility("Frost Fire");
        mage.setAgilityPoints("6");
        mage.setMagicStrength("8");

        mage.setMagicPoints("14");
        mage.setHealthPoints("4");
    }

    private void setuptheifstats(){
        Theif theif = new Theif();
        theif.setStrength("4");
        theif.setAbility("Singing blades");
        theif.setAgilityPoints("8");
        theif.setMagicStrength("4");

        theif.setHealthPoints("6");
        theif.setMagicPoints("3");
    }

    private void setupwarriorstats(){
        Warrior warrior = new Warrior();
        warrior.setStrength("9");
        warrior.setAbility("7 sons smash");
        warrior.setAgilityPoints("4");
        warrior.setMagicStrength("3");

        warrior.setHealthPoints("14");
        warrior.setMagicPoints("4");

    }
}
