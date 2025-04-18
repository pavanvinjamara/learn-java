package src.Class2;

import java.util.*;
// import java.util.Scanner; // Not needed if you already used `import java.util.*;`

public class ScannerInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to take input from keyboard
        Scanner sc = new Scanner(System.in);

        // Read a single word (stops at space)
        System.out.print("Enter first name: ");
        String name = sc.next();

        // Clear the leftover newline
        sc.nextLine();

        // Read a full line (name with space or any sentence)
        System.out.print("Enter full name or any sentence: ");
        String user = sc.nextLine();

        // Read integer (age)
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Read double (height)
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Read boolean (true/false)
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        // Print all inputs
        System.out.println("\n--- User Information ---");
        System.out.println("First name : " + name);
        System.out.println("Full input : " + user);
        System.out.println("Age        : " + age);
        System.out.println("Height     : " + height);
        System.out.println("Student?   : " + isStudent);
    }
}
