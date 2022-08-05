package playground2;

import java.util.Scanner;

//Define a method that returns the product of two numbers entered by user.
public class Test4 {
    public static int product(int n1, int n2) {
        return n1 * n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int n2 = sc.nextInt();

        System.out.println(product(n1, n2));
    }
}
