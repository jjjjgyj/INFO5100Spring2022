package com.company;

public class Main {

    public static long moneyInMyBank = 1;
    public static Object lockAccount = new Object();
    public static void main(String[] args) {
	// write your code here
        Thread  microsoft = new Thread(new AddMoneyInMyBank(1));
        microsoft.setName("Microsoft");

        Thread  facebook = new Thread(new AddMoneyInMyBank(1));
        facebook.setName("Facebook");

        Thread  apple = new Thread(new AddMoneyInMyBank(1));
        apple.setName("Apple");

        Thread  google = new Thread(new AddMoneyInMyBank(1));
        google.setName("Google");

        microsoft.start();
        facebook.start();
        apple.start();
        google.start();




    }
}


