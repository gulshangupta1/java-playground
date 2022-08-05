package playground2;
//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).

public class Test2 {
    public static void main(String[] args) {
        char ch = 'S';
        //A: 65    Z: 90
        //a: 97     z: 122
        if(ch>='A' && ch<='Z')
            System.out.println("Uppercase");
        else if(ch>='a' && ch<='z')
            System.out.println("Lowercase");
        else
            System.out.println("Special symbol");
    }
}
