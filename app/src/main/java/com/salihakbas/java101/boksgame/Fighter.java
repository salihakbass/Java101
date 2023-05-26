package com.salihakbas.java101.boksgame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    double firstHit;

    Fighter(String name, int damage, int health, int weight, double dodge, double firstHit) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.firstHit = firstHit;

    }
     int hit(Fighter foe) {

        System.out.println("------------");
        System.out.println(this.name + " sporcusu " + foe.name + " sporcusuna " + this.damage + " hasar vurdu ! ");
        if(foe.health - this.damage < 0) {
            return 0;
        }
        if(foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı ! ");
            return foe.health;
        }
        return foe.health - this.damage;
    }
    boolean isDodge() {
        double randomDodge = Math.random() * 100 ;
        return randomDodge <= this.dodge;
    }


}
