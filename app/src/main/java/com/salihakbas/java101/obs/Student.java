package com.salihakbas.java101.obs;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage = 0.0;
    boolean isPass = false;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    void addBulkExamNote(int trh, int mat, int fzk) {
        if(trh <= 100 && trh >= 0) {
            this.c1.note = trh;
        }
        if(mat <= 100 && mat >= 0) {
            this.c2.note = mat;
        }
        if(fzk <= 100 && fzk >= 0) {
            this.c3.note = fzk;
        }

    }
    void isPass() {
        this.avarage = (c1.note + c2.note + c3.note) / 3.0;

        System.out.println("Ortalamanız: " + this.avarage);
        if(avarage >= 55) {
            System.out.println("Sınıfı geçtiniz ! ");
            this.isPass = true;
        }else{
            System.out.println("Sınıfta kaldınız ! ");
            this.isPass = false;
        }
    }
    void printNote() {
        System.out.println("===============");
        System.out.println("Öğrenci adı: " + this.name );
        System.out.println("Tarih notu: " + this.c1.note);
        System.out.println("Matematik notu: " + this.c2.note);
        System.out.println("Fizik notu: " + this.c3.note);
    }

}
