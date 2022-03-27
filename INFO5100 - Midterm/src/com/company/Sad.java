package com.company;

public class Sad extends Moody {
    //returns string indicating sad
    public String getMood(){
        return "I feel sad today!";
    }

    //print crying string “‘waah’ ‘boo hoo’ ‘weep’ ‘sob’”
    @Override
    void ExpressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    }

    @Override
    void queryMood() {
        System.out.println("I feel sad today!");
    }

    //returns message about self : “Subject cries a lot”
    public String toString(){
        return "Subject cries a lot";
    };

}
