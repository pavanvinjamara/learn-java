package src.operators;

public class assignmentOperator {
    public static void main(String[] args) {
        // Equal to operator assignment assigning value to variable.
        int i = 5;

        // Plus Equal to operator
        //    - if we want to add a number to same variable and store in same variable we use
        //    - same with all the other operators like -, *, /, %

        i = i+5; // This operation can do using equal to operator
        System.out.println(i); // 10
        i += 5;
        System.out.println(i); // 15
        i -= 5;
        System.out.println(i); // 10
        i *= 5;
        System.out.println(i); // 50
        i /= 5;
        System.out.println(i); // 10
        i %= 5;
        System.out.println(i); // 0

    }
}
