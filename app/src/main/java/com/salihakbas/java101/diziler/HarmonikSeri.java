package com.salihakbas.java101.diziler;

public class HarmonikSeri {
    public static void main(String[] args) {
        int liste[] = {34, 55, 67, 44, 200, 55, 84};
        double toplam = 0.0;
        double harmonik = 0.0;

        for(int i = 0 ; i < liste.length; i++) {
            toplam += 1.0 / liste[i];
        }
        harmonik = liste.length / toplam;
        System.out.println(harmonik);
    }
}
