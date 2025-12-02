import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your marks : ");
        int marks = sc.nextInt();
        if (marks > 90 && marks <= 100) {
            System.out.println("A grade");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("B grade");
        } else if (marks > 35 && marks <= 75) {
            System.out.println("C grade");
        } else {

        }

    }
}
