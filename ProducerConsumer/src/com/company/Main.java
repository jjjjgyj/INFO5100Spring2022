package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static ArrayList<String> fishMarket = new ArrayList<>();
    public static Object lockMarket = new Object();
    public static void main(String[] args) {
	// write your code here
        Thread[] fishermen = new Thread[5];
        Thread[] consumers = new Thread[10];

        for (int i = 0; i < fishermen.length; i++){
            fishermen[i] = new Thread(new FisherMan());
            fishermen[i].setName("Fisherman" + i);
            fishermen[i].start();
        }

        for (int i = 0; i < consumers.length; i++){
            consumers[i] = new Thread(new Consumer());
            consumers[i].setName("Consumer" + i);
            consumers[i].start();
        }

        Queue<String> queue = new LinkedList<>();



    }
}
