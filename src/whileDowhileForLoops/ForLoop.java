package src.whileDowhileForLoops;

public class ForLoop {
    public static void main(String[] args) {
        // Syntax :-
        /* for( Initialization ; condition ; updating ){
            }*/
        for( int i=0; i< 10; i++ ){
            System.out.println("i " + i);
        }

        // Declaration at outside of loop
        int j;
        for(j =0; j<5; j++){
            System.out.println("j " + j);
        }
        // Initialization at outside of loop
        int k =0;
        for(; k<10;k++){
            System.out.println("k " + k);
        }

        // Updating inside the loop
        int l = 0;
        for(; l<10 ;){

            System.out.println("l " + l);
            l+=2;
        }
        // Condition within the loop
        int m =0 ;
        for(; ;){
           if(m<10){
               System.out.println("m " + m);
               m+=3;
           }else{
               break;
               // without break loop will not stop in this for
           }
        }
    }
}
