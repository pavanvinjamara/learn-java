package src.staticNonstatic;

import java.util.Arrays;

public class LearnStatic {
    static int number;
    public static void main(String[] args){
        System.out.println("main method");
//        Access the static variable and assign the value
        number = 10;
        System.out.println(number);
//        accessing static variable from another class
        System.out.println(Test1.number2);

    }

//    creating static block
    static {
        System.out.println("static block");
    }
//    creating non-static block
    {
        System.out.println("non - static block");
    }

//    constructor
    public LearnStatic(){
//        There is no static constructor we have only non-static constructor
        System.out.println("constructor");
    }

}
