package com.objects.armor;

public class Armor {

   public Cloth cloth;
   public Leather leather;
   public Mail mail;
   public Plate plate;

    public Armor(Cloth cloth, Leather leather, Mail mail, Plate plate) {
        this.cloth = cloth;
        this.leather = leather;
        this.mail = mail;
        this.plate = plate;
    }

    public Armor() {
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    public Leather getLeather() {
        return leather;
    }

    public void setLeather(Leather leather) {
        this.leather = leather;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }
}
