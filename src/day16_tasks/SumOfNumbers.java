package day16_tasks;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




        int sum = 0;
        while (true) {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();

            if(num < 0) {
                break;
            }
            sum += num;
        }
    }
}
