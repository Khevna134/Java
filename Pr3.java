import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            char c = Character.toLowerCase(ch);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
//output
//Enter a character:
//a
//Vowel
