package src.POJOClassBeanClass;

public class UsePOJOClass {
    static void main(String[] args) {
        POJOClass e = new POJOClass();
        e.setId(101);
        e.name="Ram";
        e.salary = 121555.3;

        POJOClass e1 = new POJOClass();
        e.setId(102);
        e.name="krishna";
        e.salary = 121550.3;
        POJOClass e2 = new POJOClass();
        e.setId(103);
        e.name="sita";
        e.salary = 120555.3;

        POJOClass[] employees = new POJOClass[]{e, e1, e2};
//        Real time we use to mapping the data in db so we can easily access the data.
        System.out.println(e.getId());
        System.out.println(e.name);
        System.out.println(e.salary);
    }
}
