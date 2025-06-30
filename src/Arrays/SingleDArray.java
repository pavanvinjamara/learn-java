package src.Arrays;

public class SingleDArray {
    public static void main(String[] args) {
        //  Normally we declare variable
            int i ;

        //  To Declare an array
        //  datatype variableName[] or datatype[] variableName;
        //  [] square bracket are denoting array
        //  we can use class has datatype
            int arr[];
            int[] arr2; // --- Iam prefer this one
            SingleDArray[] arr3; //---- using class has datatype

        // Initialization
        // - To initialize we need to give size --> But how can we give size ?
        // - To give size we need to create object or in object creation we can give size

        // variableName  = new(keyword) datatype[size];
            arr2 = new int[5]; // It creates [0, 0, 0, 0, 0] index start from "0" & end at "size-1"

        // dataType[] variableName =  { values } this can be use when you know the value before
            int[] j = { 5, 8, 5, 9, 0 };
        // another way
            int[] l = new int[]{ 3, 5, 6, 8, 0};
            // Use of initialization is
            int[] arr0;
            // arr0 = { 5, 8, 5, 9, 0 }; this cannot be done  in this place we use above initialization.
            arr0 = new int[]{ 2, 3, 7, 10 };

        //  [ 0, 0, 0, 0, 0]     array & values
        //    0, 1, 2, 3, 4      indexes

        //  datatype[] variableName = new(keyword) datatype[size];
            String[] arr4 = new String[5]; // It creates [null, null, null, null, null]
            boolean[] arr5 = new boolean[2]; // It creates [false, false]
        // - If we give more than 5, it gives exception

        // Assign values at particular index of array
        // Syntax :-
        // variableName[index] = value
            arr2[0] = 2;    // [2, 0, 0, 0, 0]
            arr2[3] = 10;   // [2, 0, 0, 10, 0]

        // Re-assigning the value at particular index of array
            arr2[0] = 8;    // [8, 0, 0, 10, 0]

        //  arr2[5] = 10;  // gives exception ArrayIndexOutOfBound

        // Retrieve the value at particular index of array
        // Syntax :-
        //  variableName[index]
            System.out.println(arr2[0]); // 8

        // To retrieve all values from array use for loop
        // Syntax :-
        //  for( initialize with 0; condition up to size; update){}
        // Initialize can start from anywhere, but I want from 0 index, so I am using 0
        // Condition can be "k < size" || "k <= size-1"
        // To know the size of array use "variableName.length" arr2.length
            for(int k = 0; k < 5; k++){
                System.out.println("k : " + k + " value: " + arr2[k]);
            }
            int sum = 0;
            for(int k = 0; k < j.length; k++){
               sum += j[k];  //  sum = sum + j[k];
                System.out.println("sum :- " + sum);
            }

        // To print size of array => variableName.length
            System.out.println(arr0.length);

    }
}
