import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Principel : ");
        int p = sc.nextInt();
        System.out.println("Enter value of Rate of interest : ");
        int r = sc.nextInt();
        System.out.println("Enter value of Time : ");
        int t = sc.nextInt();
        int si = p * r * t / 100;
        System.out.println("Simple interest :" + si);

    }
}