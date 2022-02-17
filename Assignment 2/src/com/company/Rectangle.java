package com.company;

public class Rectangle extends Shape{
    public double length;
    public double width;

    public Rectangle(double length, double width){
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return length * width;
    }

    @Override
    public double getPerimeter(){
        return 2 * (length + width);
    }
}
