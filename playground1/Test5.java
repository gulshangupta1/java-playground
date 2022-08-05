package playground1;
//Print multiplication table of 24, 50 and 29 using loop.
public class Test5 {

    public static void table(int a) {
        System.out.println("Multiplication table of "+ a);
        for(int i=1; i<=10; i++)
            System.out.println(a +" * "+ i +" = "+ a*i);
        System.out.println("-----------------------------------------------");
    }

    public static void main(String[] args) {
        table(24);
        table(50);
        table(29);
    }
}
