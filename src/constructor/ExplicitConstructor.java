package src.constructor;

public class ExplicitConstructor {
    public int i;
    public static void main(String[] args) {
        //Explicit constructors can differentiate using parameter

        // No parameter constructor
        ExplicitConstructor cp = new ExplicitConstructor();
        System.out.println(cp.i); // 0

        //parameterized constructors
        ExplicitConstructor cp2 = new ExplicitConstructor(20);
        System.out.println(cp2.i); // 20

        ExplicitConstructor cp3 = new ExplicitConstructor("Pavan");
        System.out.println(cp3.i);//0
    }

    public ExplicitConstructor(){

    }
    public ExplicitConstructor(int a){
        i = a;
    }
    public ExplicitConstructor(String b){

    }
}
