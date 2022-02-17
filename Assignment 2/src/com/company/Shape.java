package com.company;

public class Shape {
    public String name;
    public String color;
    public double perimeter;
    public double area;

    public Shape() {
    }

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, double perimeter, double area){
        this.name = name;
        this.color = color;
        this.perimeter = perimeter;
        this.area = area;
    }

    public void printShape(){
        System.out.println("This is " + name + " in " + color + " color with perimeter of " + this.getPerimeter() + " and area of " + this.getArea() );
    }

    public void display(){
        System.out.println("This has perimeter of " + this.getPerimeter() + " and area of " + this.getArea() );
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
