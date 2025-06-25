package src.decisionMakingStatement;

public class switchCondition {
    public static void main(String[] args) {
        // Normal Syntax
        int i= 5;
        switch(i){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("default");

        }
        // Condition for same operation for multiple values
        int j= 10;
        switch (j){
            case 1:
            case 2:
            case 3:
                System.out.println("first");
                break;
            case 4:
                System.out.println("second");
                break;
            default:
                System.out.println("default2");
        }

        // Use of break statement
        switch (j){
            case 1:
                System.out.println(0);
            case 2:
                System.out.println(-1);
            case 3:
                System.out.println(-3);
                break;
            case 4:
                System.out.println(-4);
                break;
            default:
                System.out.println("PAVAN");
        }

        // Nested switch statement
        switch (j){
            case 1:
                System.out.println("ram");
                break;
            case 2:
                switch (j*3){
                    case 3:
                        System.out.println(3);
                        break;
                    case 10:
                        System.out.println(10);
                        break;
                    default:
                        System.out.println("default 2");
                }
                break;
            default:
                System.out.println("default 1");
        }
    }
}
