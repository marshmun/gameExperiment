package com.setupobjects;

import com.objects.race.Elf;
import com.objects.race.Gnome;
import com.objects.race.Human;
import com.objects.race.Orc;

public class SetupRacestats {


    private void setupelfstats(){
        Elf elf = new Elf();
        elf.setHitpoints("3");
        elf.setAgility("6");
        elf.setMagicPoints("5");
        elf.setStrength("5");
        elf.setMagicStrength("6");
        elf.setTrait("Elf beam");
    }

    private void setupgnomestats(){
        Gnome gnome = new Gnome();
        gnome.setHitpoints("4");
        gnome.setAgility("6");
        gnome.setMagicPoints("5");
        gnome.setStrength("4");
        gnome.setMagicStrength("6");
        gnome.setTrait("Gnome grande!");
    }

    private void setuphumanstats(){
        Human human = new Human();
        human.setHitpoints("5");
        human.setAgility("5");
        human.setMagicPoints("5");
        human.setStrength("5");
        human.setMagicStrength("5");
    }

    private void setuporcstats(){
        Orc orc = new Orc();
        orc.setHitpoints("7");
        orc.setAgility("4");
        orc.setMagicPoints("3");
        orc.setStrength("8");
        orc.setMagicStrength("3");
    }

}
