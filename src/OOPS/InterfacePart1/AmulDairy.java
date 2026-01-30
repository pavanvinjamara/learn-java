package src.OOPS.InterfacePart1;

public class AmulDairy implements DairyFarm{
    @Override
    public void cowMilk() {
        System.out.println("AmulDairy buffaloe Milk");
    }

    @Override
    public void buffaloMilk() {
        System.out.println("AmulDairy 30 Litres Milk");
    }

    @Override
    public void minLitresPerDay() {
        System.out.println("AmulDairy 50 Litres Milk");
    }

    @Override
    public void maxLitresPerDay() {
        System.out.println("AmulDairy 50 Litres Milk");
    }

    public void ghee(){
        System.out.println("AmulDairy Ghee");
    }
}
