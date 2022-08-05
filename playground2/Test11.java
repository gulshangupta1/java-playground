package playground2;
// Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".
public class Test11 {
    public static void main(String[] args) {
        String str = "Hello, World";
        System.out.println("First index of 'o': "+ str.indexOf('o'));
        System.out.println("Last index of 'o': "+ str.lastIndexOf('o'));
        System.out.println("Index of ',': "+ str.indexOf(','));
    }
}
