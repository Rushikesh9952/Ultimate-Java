import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter redius of circle");
        int r = sc.nextInt();
        double c = 2 * 3.14 * r;
        System.out.println("circumference of circle : " + c);
    }
}
