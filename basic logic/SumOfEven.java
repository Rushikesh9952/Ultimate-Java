import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range of even number : ");
        int num = sc.nextInt();

        int number = 0;
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            number += 2;
            sum += number;

        }
        System.out.println(sum);
    }
}
