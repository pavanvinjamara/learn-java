package src.Strings;
import java.util.Arrays;

public class StringMethods2 {
    public static void main(String[] args) {
        //  => length
        //  => trim
        //  => toCharArray
        //  => toLowerCase
        //  => toUpperCase

        String s1 = "hello";
        String s2 = " pavan kumar ";
        String s3 = "HELLO";
        System.out.println(s1.length()); // gives length of string
        // * note it count spaces also

        // To remove start and end space of string and not removing between space
        // we use trim method
        System.out.println(s2.trim());

        // To convert total string into uppercase
        System.out.println(s2.toUpperCase());

        // To convert into lowercase
        System.out.println(s3.toLowerCase());

        // To string into character array
        char[] a = s1.toCharArray();
        System.out.println(a);


        //===========

        // => indexOf
        // => lastIndexOf
        // => subString
        // => split
        // => charAt

        // indexOf
        // To get the index of char in given string
        // If it found the character gives index or else it gives -1
        // indexing starts from zero
        // It search from start gives the first character index only if we have two or more letters
        System.out.println(s1.indexOf('l'));

        // same like indexOf but It gives last index
        System.out.println(s1.lastIndexOf('l'));

        // take a string from string we use substring method
        // takes index it starts from that index up to last
        System.out.println(s1.substring(2)); // start index to last
        // takes two index start and end point nad make a another string
        System.out.println(s2.substring(2,8)); // start index and last index

        // using character break string into character arr or string Arr
        System.out.println(s2.split(" "));
        // To array into string use to string method
        System.out.println(Arrays.toString(s2.split(" ")));

        // give index take out the character at that index
        System.out.println(s2.charAt(5));

        // ==============
        // replace
        // replaceAll
        //valueOf
        //isEmpty
        // isBlank


        //To replace one character with another character
        System.out.println(s1.replace('l', 'o'));
        System.out.println(s2.replace("pavan", "hello"));

        String s4 = "178"; // It is a number in string
        // to take it has a number we use
        System.out.println(Integer.valueOf(s4));

        int i = 7898;
        System.out.println(String.valueOf(i));

        // check whether it is empty
        String s5 ;
        String s6 = "  ";
        String s7 = "";
        // we cannot use this method for s5 because we did not intialize
        // System.out.println(s5.isEmpty());
        System.out.println(s6.isEmpty()); // string length == 0 only empty
        System.out.println(s6.isBlank()); // string consist only blank or empty
        System.out.println(s7.isEmpty());
        System.out.println(s7.isBlank());
    }
}
