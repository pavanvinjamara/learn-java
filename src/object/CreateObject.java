package src.object;

public class CreateObject {

    public static void main(String[] args) {
      CreateObject co = new CreateObject();
      CreateObject co1 = new CreateObject();
      CreateObject co2 = new CreateObject(2);
      // Print hash code of object
        System.out.println(co.hashCode());
        System.out.println(co1.hashCode());
        System.out.println(co2.hashCode());
        // It gives different hashcode number, It means they are different.
    }
    public CreateObject(){

    }
    public CreateObject(int i){

    }
}
