package src.object;
// Accessing the variables and methods from another class
public class AccessObj {
    public static void main(String[] args) {
        // We can access another class details in any class, but we have some restrictions that we discuss in access modifiers.
        VariableInObject c1 = new VariableInObject();

        // Accessing variables of another method
        System.out.println(c1.i);

        // Calling another class method
        System.out.println(c1.add());
    }
}
