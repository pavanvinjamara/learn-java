package src.Class2;

public class LearnVariable {
    public static void main(String[] args){
        // To show Output
        System.out.print("Started Variables");
        //   To Print in new line we use
        System.out.println("new line");

        // Variable
        int a = 1;
        String name = "pavankumar";
        double price = 20.25;

        // Data Type
        // Two data types - 1)Primitive, 2) Non-primitive

        // Primitive Data Type
            // Basic Data type which are already present in java
            //   byte, short,char,boolean, int, long,float,double
            //   Memory Space
                // byte - 1 bytes (1 bit = 01) 1byte = 8bits(01010101)
                // char - 2 bytes
                // boolean - 1 bytes
                // int - 4 bytes
                // long - 8 bytes
                // float - 4 bytes
                // double - 8 bytes
                // In depends on system above bytes are according to 64 bit ,
                // if it is  32-bit int is 2 byte only.
        //  Non-Primitive Data Type
            //   which we can build them
            // String, Array, Class, Object, Interface

        // Do some mathematical problems
        int b = 25;
        int c = 10;

        int ans1 = b*c/b-c;
        System.out.println(ans1);
        int ans2 = (b*c)/(b-c);
        System.out.println(ans2);



    }
}
