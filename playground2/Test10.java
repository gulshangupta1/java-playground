package playground2;
// Write a program to check if the letter 'e' is present in the word 'Umbrella'.
public class Test10 {
    public static boolean containsChar(String str, char ch) {
        for(int i=0; i<=str.length()-1; i++)
            if(str.charAt(i) == ch)
                return true;
        return false;
    }

    public static void main(String[] args) {
        if(containsChar("Umbrella", 'e'))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
