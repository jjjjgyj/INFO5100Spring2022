package com.company;

public class Psychiatrist {
    //asks moody object about its mood
    public void examine(Moody moodyObject) {
        System.out.println("How are you feeling today?");
        moodyObject.getMood();

    }

    //a moodyObject is observed to either laugh or cry
    public void observe(Moody moodyObject) {
        moodyObject.ExpressFeelings();
        //returns message about self: “Subject laughs a lot”
        moodyObject.toString();
    }


}
