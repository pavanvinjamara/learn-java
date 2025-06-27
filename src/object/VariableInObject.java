package src.object;

public class VariableInObject {
    // Delecaring variables
    int i;
    int j;
    public VariableInObject(){
        // Initialization
        i = 10;
        j = 20;

    }
    public VariableInObject(int i, int j){
        this.i = i;
        this.j = j;
    }
    public static void main(String[] args) {
        VariableInObject v1 = new VariableInObject();
        VariableInObject v2 = new VariableInObject(20, 60);
        VariableInObject v3 = new VariableInObject(30, 40);

        // Access variables using Object reference
        System.out.println(v1.i);
        System.out.println(v2.j);

        // Calling method using object reference
        System.out.println(v1.add());
        System.out.println(v2.add());
        System.out.println(v3.add());

        // We can check object are equal or not
        System.out.println(v1 == v2);
        System.out.println(v2 == v3);

        // Accessing variables and methods in other class refer AccessObj.java file
    }

    //add method
    public int add(){
        return (i+j);
    }

}
