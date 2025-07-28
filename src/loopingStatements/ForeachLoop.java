package src.loopingStatements;

public class ForeachLoop {
    public static void main(String[] args) {
        // Foreach loop is extension method of for loop
        // foreach can have limitation, we can use only for collection and Array
        // for and foreach only differ from syntax.
        // ** Syntax :-
        //      => for(dataType variableName: arrayOrCollection){
        //          //statements
        //      }
        // foreach cannot suit for decremetion, cannot access last to first
        // we cannot get the index in foreach loop

        int[] arr = {1,2,3,4,5,6,7};
        for( int item:arr){
            System.out.println(item);
        }

        int[][] arr2 = {
                {1, 2 ,3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int[] singleArr:arr2){
            for(int value:singleArr){
                System.out.println(value+"---");
            }
        }

        // same goes with jagged array
    }
}
