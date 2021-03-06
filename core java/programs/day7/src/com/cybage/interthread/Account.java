package com.cybage.interthread;

 

public class Account {
    private int balance = 25000;
    
    public synchronized void withdraw(int amount) {
        
        System.out.println("performing withdrawal operation");
        
        //logic for withdrawal
        if(this.balance <= amount) {
            //need to keep withdraw in waiting state till deposit happens
            System.out.println("low account balance...");
            try {
                wait();                //waiting for other method to finish
            } catch (InterruptedException e) {
                System.err.println(e.getLocalizedMessage());
            }
        }
        this.balance -= amount;
        
        System.out.println("withdrawl operation finished");
    }
    
    public synchronized void deposit(int amount) {
        System.out.println("performing deposit operation");
        
        //logic for deposit        
        this.balance += amount;
        notify();    //i have finished.. so waiting thread can resume execution
        
        System.out.println("deposit operation finished");
    }

 

}