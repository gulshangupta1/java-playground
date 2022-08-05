package playground2;

import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
public class Test3 {

    public static int maximum(int a, int b, int c) {
        int temp = a>b ? a : b;
        if(temp > c)
            return temp;
        else
            return c;
    }

    public static int minimum(int a, int b, int c) {
        int temp = a<b ? a : b;
        if(temp < c)
            return temp;
        else
            return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int a = sc.nextInt();
        System.out.print("Enter number2: ");
        int b = sc.nextInt();
        System.out.print("Enter number3: ");
        int c = sc.nextInt();

        System.out.println("Maximum number: "+ maximum(a, b, c));
        System.out.println("Minimum number: "+ minimum(a, b, c));
    }
}
