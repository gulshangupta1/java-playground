package playground1;
//A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter year of service: ");
        int yearOfService = sc.nextInt();
        double netSalary = salary * 12;
        double bonus = 0;
        if(yearOfService > 5)
            bonus = (double)5/100 * netSalary;
        System.out.println("Net bonus amount: "+ bonus);
    }
}
