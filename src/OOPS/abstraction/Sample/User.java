package src.OOPS.abstraction.Sample;

public class User {
    public static void main(String[] args) {
//        we are implementing functionality in Govind chai
//        To hide the functionality we use ChaiFranchise to make object and hide the functionality
        ChaiFranchise chai = new GovindChai();
        chai.teaPowder();
    }
}
