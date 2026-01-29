package src.OOPS.encapsulation;

public class Student {
    private int rollNumber;
    private String name;
    private boolean isAttended;
//    Making them private we can access within the class

    public int getRollNumber() {
        return rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public  void setIsAttended(boolean flag){
        this.isAttended = flag;
        System.out.println("set the student attendance");
    }

    public boolean getIsAttended(){
        System.out.println("get the student attendance");
        return this.isAttended;
    }

}
