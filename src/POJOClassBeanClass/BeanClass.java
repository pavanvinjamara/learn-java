package src.POJOClassBeanClass;

import java.io.Serializable;

public class BeanClass implements Serializable {
    private int id;
    private String name;
    private double marksPercent;

    public BeanClass(){

    }
    public BeanClass(int id, String name){

    }
//    If there is no constructor java itself takes no argument constructor has default.
//    But if you declare an argument constructor then you should declare no argument constructor also.


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMarksPercent() {
        return marksPercent;
    }

    public void setMarksPercent(double marksPercent) {
        this.marksPercent = marksPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
