package src.printStatements;

public class printStatements {
    public static void main(String[] args) {
        // we have 3 methods to print output
        //   - print
        //   - printf
        //   - println

        // print method prints in same line ( In console cursor will be in same line )
        System.out.print(true);
        System.out.print("how are you");

        //println method prints in new line ( In console cursor will be in new line )
        System.out.println(false);
        System.out.println("how are you");

        //printf method we can format data while printing. behaviour same like print ( In console cursor will be in same line )
        System.out.printf("The current year is %d and the month is %s", 2025, "June");
        // -----------------* formated strings *------------
        // Note: -
        //     %b   - boolean
        //     %c   - character
        //     %d   - integer
        //     %e   - scientific notation
        //     %f   - floating point
        //     %s   - string
        //     %tc  - complete data and time
        //     %n   - a newline on this platform
        //     %%   - the character %

        // To print errors we use err method, in this you can use print, println & printf.
        System.err.println("Error in request");
    }
}
