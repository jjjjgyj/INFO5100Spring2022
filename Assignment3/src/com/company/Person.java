package com.company;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Function 1: subscribe
    public void subscribe(SeattlePoliceDepartment spd){
        if (!spd.citizens.contains(this)){
            spd.citizens.add(this);
        }
    }

    // Function 2: unsubscribe
    public void unsubscribe(SeattlePoliceDepartment spd){
        if (spd.citizens.contains(this)){
            spd.citizens.remove(this);
        }
    }

    // Function 3: get notification
    public void getNotification(SeattlePoliceDepartment spd){
        System.out.println("*************");
        System.out.println("Publisher Name: " + spd.getName());
        System.out.println("Citizen Name: " + this.getName());
        System.out.println("Citizen Age: " + this.getAge());
        System.out.println("Message: " + spd.getMessage());
        System.out.println("*************\n");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
