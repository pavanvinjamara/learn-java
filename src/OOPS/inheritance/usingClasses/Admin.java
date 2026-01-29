package src.OOPS.inheritance.usingClasses;

public class Admin extends Developer {
//    To access read and write functionality/methods
//    we inherit from the developer class
//    To inherit we use keyword extends and super class name
    public void manage(){
        super.read(); // call super(parent) class method
        read(); // locally available class method means subclass method
        System.out.println("Manage");
    }

//    To understand super key word
//    Suppose we create a read method specially for Admin we are not using guest read
//    creating read method
    public void read(){
        System.out.println("Admin read method");
    }
//    if you call read method in manage method .it calls local read method which is from admin
//    Because first java looks for locally available method and uses it.
//    if it not found it search from parent if available uses it.

//    But now I want to use read method from parent class not locally available read.
//    To do that we use super keyword using this we can refer parent and call the method.

}
