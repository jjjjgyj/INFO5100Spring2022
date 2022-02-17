package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Question 1
        System.out.println("\nQuestion 1 answers: ");
        Student student1 = new Student(101, "ABC");

        System.out.println("Roll number of first student: " + student1.getRollNumber());
        System.out.println("Name of the first student: " + student1.getName());

        Student student2 = new Student(student1);
        System.out.println("Roll number of the second student: " + student2.getRollNumber());
        System.out.println("Roll number of the second student: " + student2.getName());
        System.out.println();

        // Question 2
        System.out.println("Question 2 answers: ");
        Triangle triangle1 = new Triangle("triangle 1", "yellow", 3, 3);
        Triangle triangle2 = new Triangle("triangle 2", "red", 2);
        triangle1.printShape();
        triangle2.printShape();

        Rhombus rhombus1 = new Rhombus("rhombus 1", "green", 1, 2);
        Rhombus rhombus2 = new Rhombus("rhombus 2", "blue", 3, 4);
        rhombus1.printShape();
        rhombus2.printShape();
        System.out.println();

        // Question 3
        System.out.println("Question 3 answers: ");
        Shape s = new Shape();
        Rectangle r = new Rectangle(2.0, 3.0);
        Circle c = new Circle(4.0);
        r.getArea();
        r.getPerimeter();
        c.getArea();
        c.getPerimeter();
        r.display();
        c.display();
        s.display();
        System.out.println();

        // Question 4
        System.out.println("Question 4 answers: ");
        Player alpha = new Player("Alpha", 98);
        Player aaron = new Player("Aaron", 88);
        Player beta = new Player("Beta", 70);
        Player cindy = new Player("Cindy", 88);
        Player david = new Player("David", 92);
        Player ethan = new Player("Ethan", 88);

        Player[] players = {alpha, aaron, beta, cindy, david, ethan};

        System.out.println("BEFORE Sorting");
        printPlayers(players);

        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                if (o1.getScore() != o2.getScore()){
                    return -1 * Integer.compare(o1.getScore(), o2.getScore());
                }else{
                    return (1) * o1.getName().compareTo(o2.getName());
                }
            }
        });

        System.out.println("\nAFTER Sorting");
        printPlayers(players);
    }

    private static void printPlayers(Player[] players){
        for (Player player: players){
            System.out.println("Player: " + player.getName() + " | Score: " + player.getScore());
        }
    }

}
