package playground1;
//A shop will give a discount of 10% if the cost of the purchased quantity is more than 1000.
//Ask the user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for the user.

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        int costPerUnit = 100;
        double total = quantity * costPerUnit;
        if(total > 1000)
            total -= (double)10/100 * total;
        System.out.println(total);
    }
}
