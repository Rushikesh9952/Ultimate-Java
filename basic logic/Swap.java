public class Swap {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 : " + num1 + " & " + "num2 : " + num2);
        // int temp;
        // temp = num2;
        // num2 = num1;
        // num1 = temp;
        // System.out.println("num1 : " + num1 + " & " + "num2 : " + num2);

        // without third variable

        // num1 = num1 * num2;
        // num2 = num1 / num2;
        // num1 = num1 / num2;

        num2 = num1 + num2 - (num1 = num2);

        // num1 = num1 + num2;
        // num2 = num1 - num2;
        // num1 = num1 - num2;
        System.out.println("num1 : " + num1 + " & " + "num2 : " + num2);
    }
}
