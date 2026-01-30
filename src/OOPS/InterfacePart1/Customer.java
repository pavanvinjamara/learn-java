package src.OOPS.InterfacePart1;

public class Customer {
    public static void main(String[] args) {
        NadhanDairy d1 = new NadhanDairy();
        d1.cowMilk();
        d1.curd();
        d1.fatPercent(); // overrides the interface method
        DairyFarm.security(); // static method can call by interface name

        AmulDairy d2 = new AmulDairy();
        d2.buffaloMilk();
        d2.ghee();
        d2.fatPercent();
    }
}
