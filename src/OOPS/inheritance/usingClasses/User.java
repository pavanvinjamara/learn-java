package src.OOPS.inheritance.usingClasses;

public class User {
//    To test the inheritances
    public static void main(String[] args){
        Guest guest =  new Guest();
        guest.read();

        Developer dev =  new Developer();
        dev.read();
        dev.write();

        Admin admin = new Admin();
        admin.read(); // here we can access subclass method if available, if not we access from super class
        admin.write();
        admin.manage();
    }
}
