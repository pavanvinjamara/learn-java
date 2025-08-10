package src.Strings;

public class StringIntro {
    public static void main(String[] args) {
        // To store text we use string
        //  StringClass variableName = " value ";
            String name = "Vinjamara Pavan kumar";
            String email = "pavan123@gmail.com";
        // To Print use variable name
            System.out.println(name + " - "+ email); // concatenating the string

        // StringClass variableName = new String();
            String user = new String(); // It creates empty string => ""
            String user2 = new String("Hello"); // creates "Hello" string.

        // Why String class is literal ?
        // If we print StringIntro class we get src.Strings.StringIntro@6f496d9f
        System.out.println(new StringIntro());
        System.out.println(new String("")); // gives ""
        // But string prints the text this unique behaviour make it literal.

        // Checking strings are equal or not with creating different ways ?
        String s1 = "hello"; // in string pool address 101ef
        String s2 = new String("hello");
        String s3 = "hello"; // this refers the same address 101ef

        System.out.println(s1 == s2); // gives false
        System.out.println(s2 == s3); // gives false
        // They are not equal
        // s1 creating strings using first methods stores in a separate location called "string pool"
        // java handles this type string using string pool
        // s2 will be not stored in string pool because it is an object creating method. it will create in heap memory
        // Because of this different memory location they are not equal.

        // s2 == s3 because in string pool it will not create multiple instincts when it is creating memory for new string
        // It will check same string is there are not in string if it is there it will not create it usings same location for that variable also

    }
}
