package src.learnPackageClassDatatypeVariable;

// access modifer ( class) keyword className
public class LearnClass {
    // creating variable which are like gobal
    public String Breed = "German shepard";
    public int height = 20;

    // Main method
    // Access modifer  (imp static keyword)
    //    | Keyword         | Meaning                                                                  |
    //    | --------------- | ------------------------------------------------------------------------ |
    //    | `public`        | Accessible from anywhere (required so JVM can call it).                  |
    //    | `static`        | Belongs to the class, not instances (JVM doesn't need to create object). |
    //    | `void`          | Returns nothing.                                                         |
    //    | `main`          | The name that JVM looks for as the starting point.                       |
    //    | `String[] args` | Parameter that stores command-line arguments.


    //    | Return Type | Use Case                                                            |
    //    | `int`       | When you need to return a number                                    |
    //    | `String`    | When your method returns text                                       |
    //    | `boolean`   | When you return true/false                                          |
    //    | `void`      | When the method just does something but **doesn’t return** anything |
    //    | ----------- | ------------------------------------------------------------------- |

    public static void main(String[] args) {
    LearnClass dog = new LearnClass();

    System.out.println(dog.Breed);
    }
}
