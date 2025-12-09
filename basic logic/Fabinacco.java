import java.util.Scanner;

public class Fabinacco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of series : ");
        int range = sc.nextInt();

        int num1 = 0;
        int num2 = 1;
        int sum;

        System.out.print(num1 + ",");
        System.out.print(num2 + ",");

        for (int i = 1; i <= range; i++) {
            sum = num1 + num2;
            System.out.print(sum + ",");
            num1 = num2;
            num2 = sum;
        }

    }

}
