package com.company;

public class Happy extends Moody {
    //returns string indicating happy
    String getMood(){
        return "I feel happy today!";
    }

    //print laughter string “heeehee....hahahah...HAHAHA!!”
    @Override
    void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    @Override
    void queryMood() {
    }

    //returns message about self: “Subject laughs a lot”
    public String toString(){
        return "Subject laughs a lot";
    };
}
