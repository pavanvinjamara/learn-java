package src.whileDowhileForLoops;

public class DoWhile {
    public static void main(String[] args) {
        // Syntax
        /* do {
        *
        * }
        * while( condition );
        * */

        int i = 0 ; //Initialization

        do {
            System.out.println(i);
            // without increment or decrement and un satisfy condition makes it infinity loop
            i++; //increment
        }
        //    condition
        while (i < 10);

        /* If condition failed starting then also it will execute onces.
        *  To test that change condition to i < 0 then you will get it
        *  To know  infinity loop remove increment and check
        * */
    }
}
