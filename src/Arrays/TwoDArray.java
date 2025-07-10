package src.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        //  Declare a Multi Dimensional Array || Two Dimensional Array
        //  dataType[][] variableName
            int[][] arr;

        //  Initialization of 2D Array
        //  Syntax :-
        //  variableName = new(keyword) dataType[size of rows][size od columns]
            arr = new int[3][2];

            System.out.println(arr); // [[I@58372a00
        //  Initialize value to elements
            arr[0][0] = 1;
            arr[0][1] = 2;
        //  arr[0][2] = 3; It gives error Index out of bound because column length is 2 we give 3 element

            arr[1][0] = 3;
            arr[1][1] = 4;

            arr[2][0] = 5;
            arr[2][1] = 6;

        System.out.println(arr); //[[I@58372a00

        // To access element in multi-D Array
        System.out.println(arr[0][0]); // 1
        System.out.println(arr[2][1]); // 6

        //  Two know the array size we need to (M x N) rows x columns

        //  To access elements using for loop

        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                System.out.println(row+ " " + column);
                System.out.println(arr[row][column] + " ");
            }
        }

        // Different types of initialization

        int[][] arr1 = {{1, 2},{6,7}};
        int[][] arr2 = new int[][]{{1,3}, {9,5}};

        int[][] arr3;
        //arr3 = {{1, 2},{6,7}}; // This Synatx will not work this initialization
        // by using new key word we can do for that we have two different initialization
        arr3 = new int[][]{{1,2}, {9,8}}; // It works

        int[][] arr4 = new int[2][2];
        arr[0] = new int[] {1,2};
        arr[1] = new int[] {3, 4};
        // arr[1] = {3,4}; this syntax will not work same like arr3 example

        // Jagged Array
        // In jagged array columns should be empty because it is not a fixed no of columns.
        // datatype[][] variableName = new(keyword) datatype[rowSize][];
        int[][] jag = new int[4][]; // It shows imagination is like [null,null,null]
        jag[0] = new int[2];
        jag[1] = new int[5];
        jag[2] = new int[3];

        // another assign
        jag[3] = new int[] {5};
        // imagination [ [0,0],[0,0,0,0,0], [0,0,0] ]

        // Store value same like 2D Array

        arr[0][0] = 1;
        arr[0][1] = 2;

        arr[1][2] = 3;

        int[][] jag1 = {
                {1},
                {2,5,6},
                {7,0,5,3}
        };

        // hydrating mean printing will be same in jagged and multi-D Array
        // Using index or using for you can hydrate / print the element values

    }
}
