package playground1;
//Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers
public class Test6 {
    public static int gcd(int n1, int n2) {
        System.out.print("GCD of "+ n1 +" and "+ n2 +" is ");
        int result=0;
        for(int i=1; i<=n1 && i<=n2; i++) {
            if(n1%i == 0 && n2%i == 0)
                result = i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(gcd(36, 60));
        System.out.println(gcd(81, 153));
    }
}
