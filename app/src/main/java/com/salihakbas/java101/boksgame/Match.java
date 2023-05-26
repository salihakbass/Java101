package com.salihakbas.java101.boksgame;

public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        if(isFirstHit()) {
            this.f1 = f1;
            this.f2 = f2;
        }else{
            this.f1 = f2;
            this.f2 = f1;
        }
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;

    }
    void fight() {
        if(isCheckWeight()) {
            while(this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("=====YENİ ROUND=====");

                this.f2.health = this.f1.hit(f2);
                if (isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(f1);
                if(isWin()) {
                    break;
                }
                System.out.println("-----------");
                System.out.println(this.f1.name + " sağlığı : " + this.f1.health);
                System.out.println(this.f2.name + " sağlığı : " + this.f2.health);
            }
        }else{
            System.out.println("Sporcuların sikletleri uyuşmuyor.");
        }

    }

    boolean isCheckWeight() {
        return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    boolean isWin() {
        if(this.f1.health <= 0) {
            System.out.println(this.f1.name +  " sporcusu kazandı ! ");
            return true;
        }
        if(this.f2.health <= 0) {
            System.out.println(this.f2.name + " sporcusu kazandı ! ");
            return true;
        }
        return false;
    }
    boolean isFirstHit() {
        double randomNumber = Math.random() * 100;
        return randomNumber >= 50;
    }
}
