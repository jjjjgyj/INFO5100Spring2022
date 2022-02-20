package com.company;

public class Professor extends Person{
    public String name;
    public int ID;
    public int age;
    public String quiz;

    public Professor(String name, int ID, int age, String quiz){
        super(name, ID, age);
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.quiz = quiz;
    }

    public void giveQuiz(){
        System.out.println("This is Professor " + name + ". Here is the quiz: " + quiz);
    }


}
