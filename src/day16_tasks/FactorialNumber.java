package day16_tasks;

import java.util.Scanner;

/*
       Task:
                    FactorialNumber
                    write a program that can return the factorial number of any given number
                        Ex:
                            input: !5
                            output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

    System.out.println("factorial of" + num + " = " + factorial(num));

    }
    public static int factorial(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num-1);
    }
}
