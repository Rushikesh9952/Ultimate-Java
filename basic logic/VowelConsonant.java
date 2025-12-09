import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character to check vowel or consonant : ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is vowel");
            } else {
                System.out.println(ch + " is consonant");
            }
        } else {
            System.out.println("enter valid character..");
        }
    }
}
