package com.company;

public class Student {
    private String name;
    private int rollNumber;

    public Student(){
        name = "Sample Student";
        rollNumber = 0;
    }

    public Student(int rollNumber, String name){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Copy constructor
    public Student(Student student){
        Student stu = new Student();
        this.name = student.name;
        this.rollNumber = student.rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setId(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void printStudentInfo(){
        System.out.println("************");
        System.out.println("Name = " + this.name);
        System.out.println("Roll Number = " + this.rollNumber);
    }
}
