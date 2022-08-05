package playground1;

import java.util.Scanner;
//Take 10 integers from keyboard using loop and print their average value on the screen.
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum = 0;
        double avg = 0;
        for(int i=0; i<10; i++) {
            System.out.print("Enter Number["+i+"]: ");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        avg = sum / a.length;
        System.out.println(avg);
    }
}
