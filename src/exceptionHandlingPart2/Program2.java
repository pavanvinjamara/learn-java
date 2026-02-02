package src.exceptionHandlingPart2;

import java.io.IOException;

public class Program2 {
    public static void main(String[] args) throws Exception{
//        Custom Exception
        try{
            System.out.println(1/0);
        }
//        catch (ArithmeticException e){
//            throw new ArithmeticException("Stupid fellow, don't divide with zero");
//        }
        catch (ArithmeticException e){
            throw new LoginException("Please Login, with correct credential");
        }

    }
}
