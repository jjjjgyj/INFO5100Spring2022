package com.company;

// Question 10
public class Box {
    double w, h, d, volume;

    public Box(double w, double h, double d){
        this.w = w;
        this.h = h;
        this.d = d;
    }

    public double calcVolume(){
        return w * h * d;
    }
}
