package src.OOPS.inheritance;

public class Developer extends Guest{
//    here code is repeating so we have chance of code reusability from Guest class
//    public void read(){
//        System.out.println("read");
//    } // no need write we can access from guest class

//    Here we can perform inheritance accessing read method from guest class
//    To do that we use extends keyword.
//    Using that we can perform super class and subclass here developer is sub class and guest is super class
    public void write(){
        System.out.println("write");
    }
}
