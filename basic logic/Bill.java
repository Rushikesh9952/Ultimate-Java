import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter unit : ");
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = 2 * units;
        } else if (units > 100 && units <= 300) {
            bill = 2 * 100 + (units - 100) * 3;
        } else if (units > 300) {
            bill = 2 * 100 + 3 * 100 + (units - 300) * 5;
        }
        bill = bill + 2.5 * bill / 100;
        System.out.println("Bill Amount : " + bill);

    }
}
