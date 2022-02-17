package com.company;

public class Rhombus extends Shape {
    public double diagonal1;
    public double diagonal2;


    public Rhombus(String name, String color, double diagonal1, double diagonal2){
        super(name, color);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public Rhombus(String name, String color, double diagonal1){
        super(name, color);
        this.diagonal1 = diagonal1;
    }

    @Override
    public double getArea(){
        if (diagonal2 > 0) {
            return diagonal1 * diagonal2 / 2 ;
        } else {
            return diagonal1 * diagonal1 / 2;
        }
    }

    @Override
    public double getPerimeter(){
        if (diagonal2 > 0) {
            return 2 * Math.sqrt(diagonal1 * diagonal1 + diagonal2 * diagonal2);
        } else {
            return 2 * Math.sqrt(2 * diagonal1 * diagonal1);
        }
    }

}
