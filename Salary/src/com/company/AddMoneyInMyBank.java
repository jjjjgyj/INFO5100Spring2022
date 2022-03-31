package com.company;

public class AddMoneyInMyBank implements Runnable {
    int salary;
    public AddMoneyInMyBank(int salary){
        this.salary = salary;
    }
    @Override
    public void run() {
        while(true){
            synchronized (Main.lockAccount){ // Takes 100 times more time - time-consuming
                // critical section
                Main.moneyInMyBank = Main.moneyInMyBank + salary;
                System.out.println(Thread.currentThread().getName() + "Added money in your bank total = " + Main.moneyInMyBank);
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
