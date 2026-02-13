package src.collections.practiseList;

import java.util.*;
import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Integer[] arr =  new Integer[]{ 4, 5, 0, 9, 8, 10 };
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
        System.out.println(al);
        int sum = 0;
        try{
            for (int i: al){
                System.out.println(i);
//                sum += al.get(i);
            }
        } catch (IndexOutOfBoundsException ie) {
            System.out.println(ie);
        }

        System.out.println(sum);

    }
}
