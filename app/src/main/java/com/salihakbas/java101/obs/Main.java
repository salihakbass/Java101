package com.salihakbas.java101.obs;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ahmet Hoca","0531...","TRH");
        Teacher t2 = new Teacher("Mehmet Hoca","0535...","MAT");
        Teacher t3 = new Teacher("Ayşe Hoca","0534...","FZK");

        Course c1 = new Course("Tarih","101","TRH",t1);
        Course c2 = new Course("Matematik","102","MAT",t2);
        Course c3 = new Course("Fizik","103","FZK",t3);

        Student s1 = new Student("Salih Akbaş","1234","5",c1,c2,c3);
        s1.addBulkExamNote(70,50,100);
        s1.printNote();
        s1.isPass();

        Student s2 = new Student("Miraç Akbaş","1456","8",c1,c2,c3);
        s2.addBulkExamNote(40,80,90);
        s2.printNote();
        s2.isPass();

        Student s3 = new Student("Ceyda Akbaş", "1652","7",c1,c2,c3);
        s3.addBulkExamNote(10,30,80);
        s3.printNote();
        s3.isPass();





    }
}
