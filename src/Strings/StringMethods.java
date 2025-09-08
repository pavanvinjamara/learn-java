package src.Strings;

public class StringMethods {
    public static void main(String[] args) {
        // Syntax for all methods
        //   variableName.methodName(variable/string);
        // equals Method
        // To check exact replicable data means "HeLlo" is same as "HeLlo" or not
        // Ex: -
         String s1 = new String("Hello");
         String s2 = new String("Hello");
         String s3 = new String("HELLO");

        System.out.println(s1.equals(s3));// false because case-sensitive
        System.out.println(s1.equals(s2));// true

        //To make compare only data without case-sensitive
        //Use equalsIgnoreCase Method which ignore cases
        System.out.println(s1.equalsIgnoreCase(s3));// true

        // To check character or substring is present in string or not
        // We use contains Method
        // we pass single character or substring pass in double courts only
        // It returns Boolean only

        System.out.println(s1.contains("l"));// true
        System.out.println(s2.contains("llo"));//true
        System.out.println(s1.contains(s2));// true

        // startsWith & endsWith Methods
        // To check whether string starts with this character or string.
        // To check whether string ends with character / string
        // Two methods return boolean

        System.out.println(s1.startsWith("H")); // true
        System.out.println(s1.startsWith("He")); // true
        System.out.println(s1.startsWith("el")); // false
        System.out.println(s1.startsWith("Hello")); // true

        System.out.println(s1.endsWith("o")); // true
        System.out.println(s1.endsWith("lo")); // true
        System.out.println(s1.endsWith("el")); // false
        System.out.println(s1.endsWith("Hello")); // true


    }
}
