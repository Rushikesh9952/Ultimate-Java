import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter odd numbers count : ");
        int num = sc.nextInt();
        int sum = 0;
        int count = -1;
        for (int i = 1; i <= num; i++) {
            count += 2;
            sum += count;
        }
        System.out.println(sum);
    }
}
