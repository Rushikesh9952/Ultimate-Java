public class LargestOfThree {

    public static void main(String[] args) {
        int num1 = 978;
        int num2 = 777;
        int num3 = 388;

        // if (num1 > num2 && num1 > num3) {
        // System.out.println(num1 + " num1 is largest");
        // } else if (num2 > num1 && num2 > num3) {
        // System.out.println(num2 + " num2 is largest");
        // } else {
        // System.out.println(num3 + " num3 is largest");
        // }

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("num1 is largest" + num1);
            } else {
                System.out.println("num3 is largest" + num3);
            }
        } else if (num2 > num3) {
            System.out.println("num2 is largest " + num2);
        } else {
            System.out.println("num3 is largest " + num3);
        }
    }
}