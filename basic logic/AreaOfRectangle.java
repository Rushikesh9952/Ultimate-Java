import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length :");
        int length = sc.nextInt();
        System.out.println("Enter width :");
        int width = sc.nextInt();
        // int are=length*width;
        System.out.println("Area of Rectangle : " + width * length);

    }

}
