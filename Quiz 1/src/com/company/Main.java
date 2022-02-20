package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Professor ashish = new Professor("ashish", 1, 40, "How to create a class?");
        Student yunjia = new Student("yunjia", 1, 28, "You create a class with IntelliJ.");

        ashish.giveQuiz();
        yunjia.takeQuiz();

    }
}
