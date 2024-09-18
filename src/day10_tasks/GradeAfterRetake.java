package day10_tasks;

import java.util.Scanner;

/*
Tasks 1 - GradeAfterRetake

    First for practice Do NOT need create a class for this. You can answer what is the output.

    Once you have your answers then you can create a class called GradeAfterRetake in your Practice_Programming project and inside the day09_tasks package. You can put all tasks in one class


        Task:
    		Write a program that will give the grade after the retake.
    		The program should read a score of the test and which attempt it was.
        		If its the first attempt -> subtract 10%
        		If its the second attempt -> subtract 20%
        		If its the third attempt -> subtract 35%

		Note: Use Scanner class

		Example Output:
			Put your score:
			70
			Which attempt is this to retake the test?
			2
			After the second retake attempt, your score is: score



 */
public class GradeAfterRetake {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Put your grade:");
        double grade = key.nextDouble();

        System.out.println("Which attempt it is");
        double attempt = key.nextDouble();

        if(attempt == 1) {
            grade -= grade * 0.10; //Subtract 10% of the grade
            System.out.println("After first attempt\t"+ grade);
        }else if(attempt == 2) {
            grade -= grade * 0.20;//Subtract 20% of the grade
            System.out.println("After second attempt\t" + grade);
        } else if(attempt == 3) {
         grade -= grade * 0.35; //Subtract 30% of the grade
         System.out.println("After third attempt\t" + grade);

        } else {
            System.out.println("Invalid attempt");
        }



    }
}
