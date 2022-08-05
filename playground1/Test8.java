package playground1;
// Take two int values from the user and print the greatest among them.
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int a = sc.nextInt();
        System.out.print("Enter n2: ");
        int b = sc.nextInt();
        int max=0;
        max = a > b ? a : b;
        System.out.println("Max: "+max);
    }
}
