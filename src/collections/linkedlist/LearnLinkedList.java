package src.collections.linkedlist;

import java.util.*;

public class LearnLinkedList {
    public static void main(String[] args) {
//         We can declare this many types because it implements List and Deque Interface
//        List<Integer> l1 = new LinkedList<>(); It can implement only List interface methods only
//        because object is created related to List
//        Queue<Integer> q1 = new LinkedList<>();  It can implement only Queue related only.
//        Deque<Integer> d1 = new LinkedList<>(); It can implement only Queue related only.
//        Collection<Integer> c1 = new LinkedList<>();
//        Iterable><Integer> i1 = new LinkedList<>();
//        LinkedList<Integer> l1 = new LinkedList<>();

        LinkedList<String> ll1 = new LinkedList<>();
        System.out.println(ll1);

        ll1.add("P1");
        System.out.println(ll1);
        ll1.add("P2");
        ll1.add(1, "P3");
//        ll1.addAll() also we can use to add multiple data at once
        System.out.println(ll1);
//        if we not pass any index in remove method it removes the first element
        ll1.remove(1);
//        ll1.removeAll() // To remove multiple elements


        ll1.clear(); // It will set first and last Node to null then grabbage collector collect all element in between and make into zero size.




    }
}
