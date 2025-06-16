package src.learnPackageClassDatatypeVariable;

public class learnParameters {
    public static void main(String[] args) {
        test(30);
    }
    // Creating a method
    // access modifier static  return type variable name (parameters:-(datatype paramName))
    //                  parameter defined here
    public static void test(int height){
        System.out.println(height);
        // parameter can only Initialization cannot be defined
        // int height = 50; it is wrong
        height = 50;
        System.out.println(height);
    }
}
