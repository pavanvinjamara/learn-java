package src.userInput;

import java.util.Scanner;

public class userInput {
    // Giving input to variable while executing the program
    public static void main(String[] args) {
    // Normally we use like this
        // in this we cannot change value programmatically or time of execution
        int i = 10;
        System.out.println(i);

        // To take input from user , so use can decide the value of that variable
        // For this java provides Scanner class, it is a predefined class from java.util package

        // To take input from console or terminal.
        // To do that we need to create an object using scanner class

        // Syntax :-
        //Scanner class variable name = new keyword scanner constructor system input stream
        Scanner sc = new Scanner(System.in);
        // If you created once scanner object you can take multiple values also.

        // To get multiple types of data To read that we use different methods


        //Syntax :-
        // dataType variableName = scannerObjectName dot methodName

        // Byte ---> nextByte()
        byte b = sc.nextByte();

        // Short ---> nextShort()
        short s = sc.nextShort();

        // Integer ---> nextInt()
        int age = sc.nextInt();

        // Long ---> nextLong()
        long l = sc.nextLong();

        // Float ----> nextFloat()
        float balance = sc.nextFloat();

        // Double ----> nextDouble()
        double pi = sc.nextDouble();

        // Boolean -----> nextBoolean();
        boolean bool = sc.nextBoolean();

        // Char -----> .next().charAt(0)
        char j = sc.next().charAt(0);

        // String ---->  next() || nextLine();
        String word = sc.next();         // single word
        String name = sc.nextLine();      // full line


        // To close scanner after completed task we use close method
        // Syntax :- scannerObjectName dot closeMethod
        sc.close();


    }
}
