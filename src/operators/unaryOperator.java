package src.operators;

public class unaryOperator {
    public static void main(String[] args) {
        int i = 20;
        int j = 10;

        // In pre increment or decrement
        //   * Before print i first it increment by 1 mean add 1 to value and it prints.
        //   * Same goes with decrement but it decreases one number
        System.out.println(++i);

        // In post increment or decrement
        //   * first it prints value then it increment by 1 mean add 1 to value.
        //   * Same goes with decrement, it decreases one number
        //   * post is the reverse of pre
        System.out.println(i++);
        System.out.println(i);

    }
}
