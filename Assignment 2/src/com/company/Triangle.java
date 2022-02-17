package com.company;

public class Triangle extends Shape {
    public double base;
    public double height;
    public double side;


    public Triangle(String name, String color, double base, double height){
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public Triangle(String name, String color, double side){
        super(name, color);
        this.side = side;
    }

    @Override
    public double getArea(){
        if (side > 0) {
            return Math.sqrt(4) / 3 * side * side;
        } else {
            return base * height / 2;
        }
    }

    @Override
    public double getPerimeter(){
        if (side > 0) {
            return side * 3;
        } else {
            return base + height + Math.sqrt(base * base + height * height);
        }
    }

}
