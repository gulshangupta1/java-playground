package playground2;
//Write a program to find the sum and product of all elements of an array.
public class Test6 {
    public static int sum(int[] a) {
        int temp = 0;
        for (int i=0; i<=a.length-1; i++)
            temp += a[i];
        return temp;
    }

    public static int product(int[] a) {
        int temp=1;
        for (int i=0; i<=a.length-1; i++)
            temp *= a[i];
        return temp;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 10, 30};
        System.out.println("Sum: "+ sum(a));
        System.out.println("Product: "+ product(a));
    }
}
