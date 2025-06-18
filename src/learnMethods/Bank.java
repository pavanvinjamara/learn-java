package src.learnMethods;

import java.sql.SQLOutput;

// To Understand methods we are using bank application
public class Bank {
    static int currentBalance = 1000;

    // Creating greeting methods, because when user opens the application he/she saw greetings
    public static void greetingCustomer(){
        System.out.println("Hello Pavan, welcome to hello world banking app");
    }

    public void deposit(int amount){
        currentBalance = currentBalance + amount;
        System.out.println("Amount deposited successfully");
    }

    public static void withdrawal(int amount){
        //we can apply conditions also
        currentBalance = currentBalance - amount;
        System.out.println("Amount withdraw successfully");
    }

    public int getCurrentBalance(){
        return currentBalance;
    }

    public static void main(String[] args) {
        //Creating an object
        Bank bank = new Bank();

        // call the method to run the method
        greetingCustomer();
        // We cannot call non-static method from static method without reference of object u can call
        System.out.println("Current balance is :-" + bank.getCurrentBalance());

        // calling using object reference
        bank.deposit(500);
        System.out.println("Current balance is :-" + bank.getCurrentBalance());
        withdrawal(300);
        System.out.println("Current balance is :-" + bank.getCurrentBalance());
    }
}
