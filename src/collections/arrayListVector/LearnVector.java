package src.collections.arrayListVector;

import java.util.*;


public class LearnVector {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
//        * Creating Vector
//        we are creating a vector using Vector class
        Vector v1 = new Vector();
//        After creating vector it creates internally an array.
//        To check we print using variable v1,
//        If we print v1 it gives values not the address, collections are designed like that
//        default capacity is 10
        System.out.println(v1);
        System.out.println(v1.size()+ "--"+ v1.capacity());

//        * Adding elements
        v1.add("Pavan");
        v1.add("Surya");

        v1.add(1, "Aparna");
        v1.addFirst("Kumar");

        System.out.println(v1);

//        size = no of elements present in list
//        capacity: vector created array capacity
        System.out.println("capacity "+ v1.capacity()+ " size "  + v1.size());

//        Getting an element
        System.out.println(v1.get(1));
//        we can also give initialCapacity using Vector constructor
        Vector v2 = new Vector(20);

        v2.add("Nikhil");
        v2.add("Divyash");
        v2.add("Snehal");

//        To add all element from one collection array to another
        v1.addAll(v2); // It will add from end of that list
//        We can also add using index It will add from that index
        v1.addAll(1, v2);

        System.out.println(v1);

//      * Verify element /  To check element is present or not
        System.out.println(v1.contains("Snehal"));
        System.out.println(v1.containsAll(v2));

//     * Updating an element
        v1.set(0, "Shubham");

        System.out.println(v1.get(0));
// some more methods
        System.out.println(v1.indexOf("Pavan"));// to get index of that element if not there -1 it gives
        System.out.println(v1.firstElement());
        System.out.println(v1.lastElement());
//       To convert collection into  array we use:
        System.out.println(v1.toArray()); // give array address
        System.out.println(Arrays.toString(v1.toArray())); // prints array

//   Deleting / Removing an element
        v1.remove("Snehal"); // remove first element only
        System.out.println(v1.contains("Snehal"));
        System.out.println(v1 + "---remove element");
        v1.removeAll(v2); // it removes that collection elements
        System.out.println(v1);



//        To clear the list
        v1.clear();
        System.out.println(v1);

//      sending element from array when we are creating a vector using arr
        Object[] arr = new Object[]{1,2,3,4,5,6};
        Vector v3 = new Vector(Arrays.asList(arr));

        v3.add("Pavan"); // It not throws error

//        we are perform sum of those elements then it gives error/ exception
//        because string cannot convert into interger To slove this they introduce generics

        int sum = 0;
        try{
            for(int i =0; i< v3.size(); i++){
                sum += (Integer) v1.get(i);
            }
        }
        catch (ArrayIndexOutOfBoundsException aie){
            System.out.println(aie);
        }



        System.out.println(v3.size());
        System.out.println(v3);
        System.out.println(v3.capacity());

//        In java Vector is introduce in java 1.0 only
//        developers are facing problems like type safety like in above code if any body push string and
//        performing and operation it gives error or exception
//        Same collections are introduce in java 1.2 , and same problems faced by them also
//         To overcome that they introduce Generics  in java 1.5
//        we can give mention generics using <> and we cannot mention primitive type
//        we can provide only wrapper classes like for int - Integer
//        Why?
//        Because collection is an object which excepts only object because of that we should provide Object only
//        Primitive types cannot create object , because of that we cannot provide them but we can use wrapper classes.
//        has shown in below
//        It shows error if push another data type
//        It will allow null
//        Generics
        Integer[] arr1 = new Integer[]{1,2,3,4,5,6};
        Vector<Integer> v4 = new Vector<Integer>(Arrays.asList(arr1));
        v4.add(5);
        v4.add(null);
    }
}
