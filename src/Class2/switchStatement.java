package src.Class2;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch(option){
            case 1: System.out.println("option 1");
            break;
            case 2: System.out.println("option 2");
            break;
            case 3: System.out.println("option 3");
            break;
            case 4: System.out.println("option 4");
            default: System.out.println("not Selected any option");
        }

    }
}

//********************** Notes ******************
//What is switch in Java?
//The switch statement is used to execute one block of code among multiple options based on the value of an expression.
//
//It is a cleaner alternative to multiple if-else-if statements when checking for exact values.

// Syntax of switch in Java
//  switch (expression) {
//        case value1:
//        // Code to execute if expression == value1
//        break;
//        case value2:
//        // Code to execute if expression == value2
//        break;
//        ...
//         default:
//        // Code to execute if none of the cases match
//      }


//How It Works:
//The expression is evaluated once.
//
//The result is compared with each case value.
//
//If a match is found:
//
//Code under that case runs.
//
//break stops further checking.
//
//If no match is found, the default block runs (optional).

// Rules of switch Statement
//Rule	Description
//1	expression must result in int, char, byte, short, String, or enum (Java 7+ for String)
//        2	No two case values can be the same
//3	break is optional but recommended to avoid fall-through
//4	default is optional
//5	Cannot use relational operators (<, >, !=, etc.) directly
//6	From Java 14+, switch expressions support arrow syntax (->)
