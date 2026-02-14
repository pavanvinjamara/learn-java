package src.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        // --- Hashset -----
        // Hashset is a class which implements the Set Interface
//        Hashset internally uses the HashMap and hashMap uses internally Array of nodes( key, value )

//        What is Hash ?
//  :-    When we are storing the data , while storing data Hashing Mechanism is applied gives a hash code to generate the index.

//        Creating the set
        HashSet<Integer> hs = new HashSet<>();
//        Set<Integer> s = new HashSet<>(); we can also
//        In above case we use only one generic type, but internally it uses HashMap and hashMap uses key value pair
//        so how it stores means the give values store in keys and in value dummy object is stored.
//        Why we're using hashMap only what is the need to use one collection in other means
//        Because in hashMap keys always unique we are already implemented some unique data related in hashMap
//        we are use that efficiently.
        System.out.println(hs);

//        Adding the element
        hs.add(10);
        hs.add(2);
        hs.add(95);
        hs.add(7);
        hs.add(2);
//        It stores random order for us
//        not allows the duplicate values
        System.out.println(hs);

//        Remove the element
//        we need to pass the data not index
        hs.remove(95); // if data is there give true, and it removes and if not give false

//        Verify/ check data is present or not
        System.out.println(hs.contains(2));

//        Retrieval of data
//        we can use foreach or Iterators
        for (Integer element:hs){
            System.out.println(element);
        }

//        clear the data
        hs.clear();
//        check data is present or not
        System.out.println(hs.isEmpty());
//

//        ---- LinkedHashSet ----
//        It introduce in java 1.4
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
//        Linkedhashset maintain insertion order
//        Linkedhashset internally uses the LinkedhashMap -> internally link of nodes(key, value)
//        It uses same methods like hashset for addition , deletion, verify, retrieval.

//        ---- TreeSet-----
        TreeSet<Integer> ts = new TreeSet<>();
//        TreeSet internally uses the TreeMap -> binary tree
//        It maintains sorted order
//        In TreeSet Integers are by default sort in ascending order
//        It uses same methods like hashset for addition , deletion, verify, retrieval.

//        Special method use by TreeSet
        System.out.println(ts.first()); // get first element
        System.out.println(ts.last()); // get last element
        System.out.println(ts.pollFirst()); // remove first element
        System.out.println(ts.pollLast()); // remove last element

        System.out.println(ts.subSet(1, 65)); // we can give range from and to from and to can be any number which can be present or not.
//        if you perform any operation on subset it reflects on main set also
        System.out.println(ts.descendingSet()); // it makes set reverse order

    }
}
