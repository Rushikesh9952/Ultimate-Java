import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check prime or not : ");
        int num = sc.nextInt();

        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                break;
            }
        }
        if (num == i) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }
}
