package com.salihakbas.java101.obs;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note = 0;

    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
    }

    void printTeacher() {
        this.teacher.print();
    }
}
