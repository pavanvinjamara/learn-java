package src.OOPS.abstractClass;
// we are not implementing all the abstract methods from interface that's why it shows complier error
// to avoid that we need to give abstract before class
public abstract class Vendor implements Laptop{
//    Implemented Methods
    public void copy(){

    }

    public void paste(){

    }

//    we can avoid remaining abstract method
//    If you want to define but not implement methods U cannot define like below
//    By default java cannot identify them has an abstract methods
//    public void cut();
//    public void keyboard();

//    Non Implemented methods
//    you need use abstract key word to define them has an abstract method
    public abstract void cut();
    public abstract  void keyboard();

//    we can create extra methods
    public void printing(){
        System.out.println("Printing");
    }
}
