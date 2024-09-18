package Shorts;

public class MultiBranchIfStatement {
    public static void main(String[] args) {

        int x = 1;

        if (x==0) {
            System.out.println("x is zero");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is positive");
        }
    }
}
