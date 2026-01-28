package src.TypeInferenceLocalVariable;

public class TypeInference {
//    we cannot use here
//    var j = 30;
    public static void main(String[] args){
//        declaration and initialization of variable
        int number = 1;
        String name = "Pavan vinjamara";
        Boolean isHuman = true;

//        by using value complier will assign the data to the variable
        var i = 20;
        var b = "kumar";

//    we can't do like this also
//        var e ;
//        e = 10;


//         we can use like this
//        int var = 20;
//        we can use like this also
        var var = 20;
        var = var+ var;
        System.out.println(var);

//       In array we can use var this
        var arr = new int[5];
        // we should not write like this
        // var[] arr = new int[5];

//        we cannot create like this also
//        var arr2 = {1, 2, 3};

//        we can do like this we need to specify the data type.
        var arr2 = new int[]{1,2,4};

    }

//    cannot use in parameters in method
//    public static  void add(var i, int j){
//        System.out.println(i+j);
//    }
}
