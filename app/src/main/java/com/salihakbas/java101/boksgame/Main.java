package com.salihakbas.java101.boksgame;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",20,100,90,30,50);
        Fighter f2 = new Fighter("B",30,85,120,40,50);

        Match match1 = new Match(f1,f2,120,90);
        match1.fight();
    }
}
