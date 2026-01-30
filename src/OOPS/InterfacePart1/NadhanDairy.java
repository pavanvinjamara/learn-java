package src.OOPS.InterfacePart1;
// To implement interface we use key word implements and interface name
public class NadhanDairy implements DairyFarm {

    public void cowMilk() {
        System.out.println("NadhanDairy cow Milk");
    }

    @Override
    public void buffaloMilk() {
        System.out.println("NadhanDairy buffaloe Milk");
    }

    @Override
    public void minLitresPerDay() {
        System.out.println("NadhanDairy 30 Litres Milk");
    }

    @Override
    public void maxLitresPerDay() {
        System.out.println("NadhanDairy 50 Litres Milk");
    }

    public void curd(){
        System.out.println("NadhanDairy Curd");
    }
//    In below case it shows we implemented the method which is already implemented in Interface
//    To understand that we provide @Override
//    because of default method we use fatPercent method it prints "NadhanDairy fat percent"
//    It overrides the interface method in subclass
    @Override
    public void fatPercent(){
        System.out.println("NadhanDairy fat percent ");
    }



//    Error : - Class 'NadhanDairy' must either be declared abstract or implement abstract method 'cowMilk()' in 'DairyFarm'
//  Just Defined or in implemented methods are known as abstract methods
//  In DairFarm cowMilk ,buffaloMilk etc are abstract. we defined them not implemented.
//    So until we implement it shows error

//    In this case @Override key is not required.
//    but if you delete single method also it shows an error called implement abstract methods.
// we can provide extra methods but complusery implement all the abstract methods in this class
}

// After implementing all the methods NadhanDairy becomes a dairy farm.
