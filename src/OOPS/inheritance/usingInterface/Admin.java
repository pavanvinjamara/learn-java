package src.OOPS.inheritance.usingInterface;

// multiple inheritance
public interface Admin extends Developer, Guest {
//    To get read and write methods access from both interfaces
//    we use extends keyword and interface name with comma separate.

    public void manage();
}
