import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Principel : ");
        int p = sc.nextInt();
        System.out.println("Enter  Rate of interest : ");
        int r = sc.nextInt();
        System.out.println("Enter Time : ");
        int t = sc.nextInt();
        System.out.println("Number of times interest is compounded per year : ");
        int n = sc.nextInt();

        double amount = p * (1 + r / n) ^ n * t;
        System.out.println("final amount : " + amount);
    }
}
