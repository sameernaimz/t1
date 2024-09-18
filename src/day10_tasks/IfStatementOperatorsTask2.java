package day10_tasks;

import java.util.Scanner;

/*

        Task:
        	Write a program that will accept your salary amount.
    		Then also ask the user if they are full time or not (boolean).
   		If they are fulltime add 20000 to their salary,
   		but if they are part time then subtract 5000.
    		Print the final salary.

		Note: Use Scanner class (also use arithmetic operators and reassign the new values based on the true or false info)

		Example Output:
			What is you salary: $
			100000
			You are a full time employee ? (true or false):
			true
			This is you final salary: $120000
 */
public class IfStatementOperatorsTask2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter salary amount");
       Double salary = key.nextDouble();
        System.out.println("Are you full time true or false?");
        boolean fullTime = key.nextBoolean();
        if (fullTime) {
            salary += 20000;
        }else {
            salary -= 5000;
        }
        System.out.println(salary);

    }

}
