package src.POJOClassBeanClass;
// This class is satisfied by all rule of POJO Class.
public class POJOClass {
    private int id;
    public String name;
    protected double salary;
    public static void main(String[] args) {

    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public POJOClass(){
        System.out.println("no arg constructor");
    }
    public POJOClass(int id){
        this.id = id;
    }
}
