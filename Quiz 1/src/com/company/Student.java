package com.company;

public class Student extends Person{
    public String name;
    public int ID;
    public int age;
    public String quizAnswer;

    public Student(String name, int ID, int age, String quizAnswer){
        super(name, ID, age);
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.quizAnswer = quizAnswer;
    }

    public void takeQuiz(){
        System.out.println("This is Student " + name + ". Here is the quiz answer: " + quizAnswer);
    }


}
