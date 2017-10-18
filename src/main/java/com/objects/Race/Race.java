package com.objects.Race;

public class Race {

    public Elf elf;
    public Gnome gnome;
    public Human human;
    public Orc orc;


    public Race(Elf elf, Gnome gnome, Human human, Orc orc) {
        this.elf = elf;
        this.gnome = gnome;
        this.human = human;
        this.orc = orc;
    }

    public Race() {
    }

    public Elf getElf() {
        return elf;
    }

    public void setElf(Elf elf) {
        this.elf = elf;
    }

    public Gnome getGnome() {
        return gnome;
    }

    public void setGnome(Gnome gnome) {
        this.gnome = gnome;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Orc getOrc() {
        return orc;
    }

    public void setOrc(Orc orc) {
        this.orc = orc;
    }
}
