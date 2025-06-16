package src.learnPackageClassDatatypeVariable;

public class InstanceVariable {
    // Instance variable
    // It can be created in class level not in method( means here)
    int id = 10234; // Instance variable or Non-static variable
    // why it is instance varibale ?
    //  => without creating object you can access in the any method
    //     To access this variable u need to create object and through that you can access in method

    public static void main(String[] args) {
        // Creating object
        InstanceVariable student = new InstanceVariable();
        System.out.println(student.id); // accessing instance variable
    }
}
