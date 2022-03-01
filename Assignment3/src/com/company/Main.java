package com.company;

public class Main {

    public static void main(String[] args) {
    // create one instance of Seattle Police Department - the publisher
        SeattlePoliceDepartment spd = new SeattlePoliceDepartment("Seattle Police Department");

    // create 4 instances of person (citizens)
        Person person1 = new Person("Person 1", 19);
        Person person2 = new Person("Person 2", 29);
        Person person3 = new Person("Person 3", 39);
        Person person4 = new Person("Person 4", 49);

    // subscribe 3 citizens to Seattle Police Department
        person1.subscribe(spd);
        person2.subscribe(spd);
        person3.subscribe(spd);

    // publish a message from Seattle Police Department
        spd.notifyCitizen("Rainy today. Bring your umbrella.");

    // unsubscribe one citizen from Seattle Police Department
        person1.unsubscribe(spd);
    // publish a message from Seattle Police Department
        spd.notifyCitizen("Sunny now. Enjoy sunshine.");

    }
}
