package src.collections.stacks;

import java.util.*;

public class LearnStack {
    public static void main(String[] args) {
//        In Java Data structure two principles
//        LIFO - Last In First Out   - Stack
//        FIFO - First In First Out  - Queue

/*        Stack is a class in java which implements the list interface and extends the vector class
           and also represents the LIFO principle. */
//      We can only create empty stack always.
//      we cannot create stack with items. always empty.
//        Stack<String> books = new Stack<>();
//        books.add("red");
//        books.add("black");
//        books.add("white");
//
//        books.set(0, "yellow");
//        books.remove(1);
//        books.contains("red");

//        we can use above methods but if we use stack we need to flow LIFO principle for that
//        it provides some methods

//        Special Methods available in stack
//                * push   - adds element at last
//                * pop    - remove element from first
//                * peek   - shows the last added element
//                * search - It search from top and return where it finds it that number it gives

        Stack<String> books = new Stack<>();
        books.add("red");
        books.add("black");
        books.add("white");

        System.out.println(books.peek());
        System.out.println(books.pop());
        System.out.println(books.push("white"));
        System.out.println(books.search("red")); // gives 3 - stack method
        System.out.println(books.indexOf("red")); // gives 0   - vector method

        System.out.println(books.isEmpty()); // --- vector method
        System.out.println(books.empty()); // --- stack method
        System.out.println(books);

    }
}
