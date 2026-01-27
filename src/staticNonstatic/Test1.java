package src.staticNonstatic;

import java.util.Random;

public class Test1 {
    int number;
    static int number2;
    public static void main(String[] args){
//       To know difference between static and non-static memory allocation and behavior
        Test1 t1 = new Test1();
        t1.number = new Random().nextInt();
        t1.number2 = new Random().nextInt();

        Test1 t2 = new Test1();
        t2.number = new Random().nextInt();
        t2.number2 = new Random().nextInt();

        Test1 t3 = new Test1();
        t3.number = new Random().nextInt();
        t3.number2 = new Random().nextInt();


        System.out.println(t1.number + " - "+ t1.number2);
        System.out.println(t2.number + " - "+ t2.number2);
        System.out.println(t3.number + " - "+ t3.number2);




    }
}
