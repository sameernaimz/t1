package day10_tasks;

import java.util.Scanner;

/*

Task #3 - IfStatementsOperators

    Create a class called KgToPounds in your Practice_Programming project and inside the day09_tasks package
  Task:
   		Write a program that will accept a boolean value. Print out the opposite of the given boolean

		Ex:
			true -> false
            		false -> true


		Note: Use Scanner class and the ! (NOT) operator

		Example Output:
			Write a boolean value (true or false):
			true
			The opposite of you what you put is: false
 */
public class IfStatementOperators {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("write a boolean value (true or false)");
        boolean tOrF = key.nextBoolean();
        if(tOrF) {
            System.out.println("The opposite of you what you put is:" + !tOrF);
        } else if (!tOrF) {
            System.out.println("The opposite of you what you put is:" +tOrF);
        } else {
            System.out.println("Invalid");
        }

    }
}

