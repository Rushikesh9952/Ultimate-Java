import java.util.Scanner;

public class GradeSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parcentage");
        int parcentage = sc.nextInt();
        if (parcentage >= 90 && parcentage <= 100) {
            System.out.println("A+ Grade");
        } else if (parcentage >= 80 && parcentage <= 90) {
            System.out.println("A Grade");
        } else if (parcentage >= 70 && parcentage >= 80) {
            System.out.println("B+ Grade");
        } else if (parcentage >= 60 && parcentage <= 50) {
            System.out.println("B Grade");
        } else if (parcentage >= 35 && parcentage <= 60) {
            System.out.println("C Grade");
        } else if (parcentage <= 35 && parcentage >= 0) {
            System.out.println("fail");
        }
        {
            System.out.println("Enter in valid result ");
        }

    }
}