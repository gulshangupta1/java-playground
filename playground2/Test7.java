package playground2;
//Find largest and smallest elements of an array.
public class Test7 {
    public static int largest(int[] a) {
        int large=a[0];
        for (int i=0; i<=a.length-1; i++)
            if (a[i] > large)
                large = a[i];
        return large;
    }

    public static int smallest(int[] a) {
        int small=a[0];
        for (int i=0; i<=a.length-1; i++)
            if (a[i] < small)
                small = a[i];
        return small;
    }

    public static void main(String[] args) {
        int[] a = {10, 2, 44, 32};
        System.out.println("Largest element of array: "+ largest(a));
        System.out.println("Smallest element of array: "+ smallest(a));
    }
}
