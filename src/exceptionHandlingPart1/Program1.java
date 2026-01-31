package src.exceptionHandlingPart1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program1 {
//    run time exception can catch directly by java but compile time it can't,
//    we should mention them so it will be ready to catch that error
    public static void main(String[] args) throws ArithmeticException, FileNotFoundException, IOException {
        System.out.println("start execution");
        int a = 9;
        int b = 0;
        int result = 0;

//        Uncomment
//        File file =  new File("D:/resume.docx");
//        FileInputStream fis = new FileInputStream(file);
//        System.out.println(fis);

//     result = a/b;  this line throws error and stop the code execution
//        This an execption nothing cannot be divided by zero
//        To handle this execption we use try , catch and finally block
//        try handle exception if it encounters with exception throws error.
//        It can catch by catch block
//        Above exception is arithmetic use that class and handle
//        After handle exception whether it success or fail use finally to execute that code in finally.
//       try is not optional
//        after try any one catch | finally  should mandatory  || we can write both also
//        without try we cannot write catch or finally keys

        try{
            result = a/b;
        }
        catch(ArithmeticException ae){
            System.out.println(ae.toString());
//            If we want to print only message use ae.getMessage();
//            To print stacktrace use ae.getStackTrace(); stack trace means to get the line number
//            to get total details use qe.printStackTrace();

            throw ae; // To stop execute we can throw error to java stop the program
//            we should not write code after throw because it not execute java throws error
//    DO not write code after throw in this block
        }
//        this is optional depends on situation
        finally {
            System.out.println("final block");
        }

        System.out.println("output is:" + result);

        System.out.println("complete execution");
    }
}
