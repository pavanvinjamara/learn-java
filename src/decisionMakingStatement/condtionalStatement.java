package src.decisionMakingStatement;

public class condtionalStatement {
    public static void main(String[] args) {
        // rank of student
        int studentMarks = 90;

        if(studentMarks >= 90){
            System.out.println("Merit Student");
        }
        else if(studentMarks >= 50){

            System.out.println("Passed");
            // Nested statement
            if(studentMarks >50 && studentMarks < 70){
                System.out.println("Good");
            }
            else{
                System.out.println("Excellent");
            }
        }
        else {
            System.out.println("Failed");
        }
    }
}
