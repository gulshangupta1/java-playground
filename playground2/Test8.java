package playground2;

import java.util.Arrays;

// If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60],
// your program should be able to find that the subarray lies between the indexes 3 and 8.
public class Test8 {
    public static void main(String[] args) {
        int[] array = new int[] {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int[] sunArray = Arrays.copyOfRange(array, 3, 8);
        System.out.println(Arrays.toString(sunArray));
    }
}
