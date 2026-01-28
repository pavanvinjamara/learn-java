package src.staticNonstatic;

import java.util.Arrays;

public class LearnStatic {
    static int number = 12;
    public static void main(String[] args){
        System.out.println("main method");
//        Access the static variable and assign the value
        number = 10;
        LearnStatic.number = 12;
        System.out.println(number);
//        accessing static variable from another class
        System.out.println(Test1.number2);

        new LearnStatic(); // By running this we get to know non-static block created when constructor called.

    }
// Blocks are used for variable Initialization
//    creating static block
    static {
        System.out.println("static block");
    }
//    creating non-static block
    {
        System.out.println("non - static block");
    }

//    constructor
//    By default constructor creates a non-static block
    public LearnStatic(){
//        There is no static constructor we have only non-static constructor
        System.out.println("constructor");
    }


//    Note: before executing constructor it executes user defined non-static block is created so used that if any initialization we can do before executing constructor.
//    Note : static block execute in defined order and it executes before main method.
    // we can call static methods in non-static, but we cannot non-static methods in static method.
}
