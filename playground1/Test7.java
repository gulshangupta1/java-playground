package playground1;
// Take values of length and breadth of a rectangle from the user and check if it is square or not.
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        if(length == breadth)
            System.out.println("It is a square");
        else
            System.out.println("It is not a square");
    }
}
