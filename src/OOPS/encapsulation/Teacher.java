package src.OOPS.encapsulation;

public class Teacher {
    public static void main(String[] args) {
        Student s = new Student(35);
//        Suppose I need to perform two or more operation to the data
//        Let take example isAttended we need to assign the value and perform log
//        If we direct get and assign the value which is showing in below
//        s.isAttended = true; // it is a bad practise
//        Every time I need to get and set I  need to perform this two operations also which make difficult
//        in real world application
//        for that we use method to do that

//        we created methods for set and get isAttended
        s.setIsAttended(true);
        s.getIsAttended();

//        But still we can access the data and change it
//        To stop that make them private


    }
}
