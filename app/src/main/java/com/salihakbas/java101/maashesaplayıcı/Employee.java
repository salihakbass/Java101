package com.salihakbas.java101.maashesaplayıcı;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax = 0;
        if (salary >= 1000) {
            tax = salary * 0.03;
        } else {
            return 0;
        }
        return tax;
    }

    double bonus() {
        double bonusDay = 0;
        double bonusSalary = 1;
        if (workHours > 40) {
            bonusDay = workHours - 40;
            bonusSalary = bonusDay * 30.0;
        } else {
            bonusSalary = 0;
        }
        return bonusSalary;
    }

    double raiseSalary() {
        double raiseSalary = 0.0;
        if (2021 - this.hireYear < 10) {
            raiseSalary += salary * 0.05;
        } else if (2021 - this.hireYear >= 10 && 2021 - this.hireYear <= 20) {
            raiseSalary += salary * 0.10;
        } else {
            raiseSalary += (salary * 0.15);
        }
        return raiseSalary;
    }

    void printEmployee() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile maaş: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam maaş: " + (this.salary + raiseSalary()));
    }
}