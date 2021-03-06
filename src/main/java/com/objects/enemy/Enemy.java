package com.objects.enemy;

public class Enemy {

    public String health;
    public String damage;
    public String armor;

    public Enemy(String health, String damage, String armor) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }

    public Enemy() {
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }
}
