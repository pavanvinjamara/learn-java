package src.collections.arrayListVector;

import java.util.ArrayList;
import java.util.Collections;
// check before vector and come to arraylist
public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
//        Here inital capacity is 0 after adding one element our capacity is 10
        al1.add(1);
        al1.add(9);
        al1.add(10);
        al1.add(1, 2);
//        to add multiple elements from array or collection use
//        al2.addAll();

        al1.set(0, 8);

        al1.get(0);

        al1.contains(10);
        al1.remove(1);
//        al1.removeAll(); removes all element
        al1.clear();
//        here our capacity is 10
//        There is no capacity method in arraylist
//        everytime it increases with 50% of its size.
        System.out.println(al1.size());
        System.out.println(al1);

//      To make arraylist synchorized use:
        Collections.synchronizedList(al1);

    }
}
