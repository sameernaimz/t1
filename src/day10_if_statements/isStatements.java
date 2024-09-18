package day10_if_statements;

import java.util.Scanner;

/*

Task #4 - IsStatements

    Create a class called IsStatements in your Practice_Programming project and inside the day09_tasks package

        Task a:
		//Write an if statement that assigns 5 to x when y is equal to 20


        Task b:
		//Write an if statement that sets the variable fees to 50 if the Boolean variable max is true

	Task c:
		//Write an if statement that assigns 20 to the variable a if variable b is 50 and c is greater and equal to 100


	Task d:
		//Write an if statement that prints Ideal Temp if the temp is between 70 and 80
 */
public class isStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = "";
        int y = sc.nextInt();

        if (y == 20) {
            System.out.println(x += 5);
        } else {
            System.out.println("nothing");
        }
        boolean max = sc.nextBoolean();
        String fees = "";
         if(!max) {
             System.out.println("");
         } else {
             System.out.println(fees);
         }
    }

    }
