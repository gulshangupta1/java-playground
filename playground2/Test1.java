package playground2;
//Write a program to print absolute value of a number entered by user. E.g.-
//INPUT: 1        OUTPUT: 1
//INPUT: -1        OUTPUT: 1

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.println(Math.abs(a));
    }
}
