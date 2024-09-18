package day11_if_statements;
/*

    create a double variable for your hourly rate
    create a double variable for the number of hours worked per week

    calculate your net pay, with consideration of overtime pay

        if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
            (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
 */

import java.util.Scanner;

public class Overtime {
    public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
        System.out.println("Enter you hourly rate: $");
        //double hourlyRate = 40; // hardcoded
        double hourlyRate = key.nextDouble(); // dynsmic

        System.out.println("Enter you total hours: ");
        double numOfHours = key.nextDouble();

        double netPay;
        String message = "";

        //boolean isOVertime = numOfHours > 40;
        //double overTimeRate = hourlyRate = 1.5;
        //boolean overTime = hourlyRate * 1.5;
        if(numOfHours > 40) { // 43 hours --- > 40 * regularRate + 3 * overtimeRate
            //netPay = 40 * hourlyRate; // netpay with regular hours and hour pay
            netPay = (40 * hourlyRate) + ((numOfHours- 40) * (hourlyRate * 1.5));
            // regular 40 hours + ( overtime hours * overtime rate
            message = "You Worked" + numOfHours + "hours at a rate of " + hourlyRate + "Since you have overtime, your total pay is $" + netPay;
        } else {
            netPay = numOfHours * hourlyRate;
            message = "You worked" + numOfHours + "hours at a rate of " + hourlyRate + ". THERE was NO OVERTIME. You total pay is $ " + netPay;
        }
        System.out.println(message);
    }
}
