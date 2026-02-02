package src.exceptionHandlingPart2;
// extend the Custom Expection with Exception to use has exception
public class LoginException extends Exception {
    public LoginException(String message){
        super(message);
    }
}
