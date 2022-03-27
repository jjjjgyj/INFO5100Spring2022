package com.company;

/*
 *  What is a Deep copy and what is a shallow copy.
 * Create a class of Student and demonstrate shallow copy vs deep copy
 * for student class. Student class will have members as name, studentID, gpa
 * write getters and setters for the members
 * */

public class Student {
    public String name;
    public int studentID;
    public double gpa;
    public Student student;

    public Student(){
        this.name = "sample";
        this.studentID = 0;
        this.gpa = 0.0;
    }

    public Student(Student student){
        this.student = new Student();
        this.name = student.name;
        this.studentID = student.studentID;
        this.gpa = student.gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
