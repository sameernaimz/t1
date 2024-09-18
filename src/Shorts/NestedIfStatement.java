package Shorts;

public class NestedIfStatement {
    public static void main(String[] args) {

        int score = 65;

        // valid score

        if (score >= 0 && score <= 100) { // valid score
            if (score > 60) { //passing score
                System.out.println("You passed");
            } else {
                System.out.println("You failed");
            }
        } else {   System.out.println("It is NOT a valid score");
        }
    }
}
