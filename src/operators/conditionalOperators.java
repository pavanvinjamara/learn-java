package src.operators;

public class conditionalOperators {
    public static void main(String[] args) {
        int i = 20;
        int j = 10;

        // In AND both the condition need to be true,
        // if any one is false then result is false
        //                  true && true = true;
        //                  false && true = false;
        System.out.println( i < j && i != j );

        // In OR any one of the condition need to be true,
        // if both the condition false then result is false
        //                  true && false = true;
        //                  false && false = false;
        System.out.println( i < j || i != j );

    }
}
