package com.company;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    public ArrayList<Person> citizens;
    public String message;
    public String name;

    public SeattlePoliceDepartment(String name){
        this.name = name;
        this.citizens = new ArrayList<>();
    }

    // Function 1: Notify Citizen
    public void notifyCitizen(String message){
        this.message = message;
        for (Person citizen: citizens){
            citizen.getNotification(this);
        }
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
