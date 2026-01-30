package src.OOPS.InterfacePart1;

public interface DairyFarm {
//    this is what to do
    public  void cowMilk();

//    if you write below like this it becomes how to do
//    public void cowMilk(){
//    } in interface we need to say what to do not how to do\

    public void buffaloMilk();

    public void minLitresPerDay();

    public void maxLitresPerDay();

//    Introduced in Java 8  we can implement method in interfence by using default or static
//    not using access modifer consider as a public not default
//    To make method default complusary use deafult keyword
    default void fatPercent(){
        commonCode(); // calling private method
        System.out.println("fat percent check");
    }

    static void security(){
//        cannot call non-static method in static like below
//        fatPercent();
        System.out.println("Dairy security");
        staticCommonCode(); // call private static method
    }

    private void commonCode(){
        System.out.println("commonCode");
    }

//    to call method in static we can give static to the private method
    private static void staticCommonCode(){
        System.out.println("static common code");
    }

}

//To implement this interface we create class as shown in the package

