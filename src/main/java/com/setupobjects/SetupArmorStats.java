package com.setupobjects;

import com.objects.armor.Cloth;
import com.objects.armor.Leather;
import com.objects.armor.Mail;
import com.objects.armor.Plate;

public class SetupArmorStats {

    private void setupclothstats(){
        Cloth cloth = new Cloth();
        cloth.setArmorPoints("3");
        cloth.setMagicPoints("7");
        cloth.setStengthPoints("2");
        cloth.setAgilityPoints("4");
    }

    private void setupleatherstats(){
        Leather leather = new Leather();
        leather.setArmorPoints("4");
        leather.setMagicPoints("2");
        leather.setAgilityPoints("7");
        leather.setStengthPoints("3");
    }

    private void setupmailstats(){
        Mail mail = new Mail();
        mail.setArmorPoints("5");
        mail.setMagicPoints("3");
        mail.setAgilityPoints("4");
        mail.setStengthPoints("4");
    }

    private void setupplatestats(){
        Plate plate = new Plate();
        plate.setArmorPoints("6");
        plate.setMagicPoints("1");
        plate.setAgilityPoints("2");
        plate.setStengthPoints("7");

    }
}
