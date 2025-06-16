package src.learnPackageClassDatatypeVariable;

public class staticLocalVariable {
    static int rollNumber= 10243;
    // using static keyword before variable declaration is static variable
    // with is a global variable u can access this throughout the class in any method without any reference
    public static void main(String[] args) {
        System.out.println(rollNumber);
        //Local variable
        int height = 70;
        // creating a variable in method it can be access only in that method below after creating line without any reference
    }
}
