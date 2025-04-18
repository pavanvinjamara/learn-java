package src.Class2;
import java.util.*;
//import java.util.Scanner;// which imports all utils;

public class LearnInput {
    public static void main(String[] args){
        //   Take Input from terminal
        //   Using Scanner class we made an object using new keyword and class
        // which take input using passing (System.in) in scanner Class
        // To use Scanner Class we should import java utils using import key word
        Scanner sc = new Scanner(System.in);
//        Scanner:
//        A class in Java that is used to read input from various sources, like the keyboard, a file, etc.
//
//        new Scanner(System.in):
//        Creates a new Scanner object that will read input from the keyboard (console).
//
//                System.in represents standard input (i.e., the keyboard).
//
//                new Scanner(...) creates the object.
//
//                sc:
//        The name of the Scanner object. You can use any name, but sc is short for “scanner”.
        // "Create a new Scanner object that reads from the keyboard and name it sc."
        String name = sc.next();

        // Clear the leftover newline
        sc.nextLine();
//        sc.next():
//        This reads the next word (token) typed by the user. It stops reading when the user hits the space or Enter key.
//
//        Example:
//
//        User types: John Smith
//
//        sc.next() reads only: John (it stops at the space)
//
//        String name:
//        Declares a variable named name of type String to store the input.
//
//🔄 Full meaning:
//        "Read the next word typed by the user from the console and store it in a string variable named name."
    // To Read Whole Line
    // we use sc.nextLine()
        // for String next() and nextLine();
        // for int nextInt();
    String user = sc.nextLine();

    int age = sc.nextInt();
    double height = sc.nextDouble();
//         Read boolean (true/false)
//        System.out.print("Are you a student? (true/false): ");
    boolean isStudent = sc.nextBoolean();
        System.out.println(name);
    System.out.println(user);
    System.out.println(age);
    System.out.println(height);
    System.out.println(isStudent);

    }
}
