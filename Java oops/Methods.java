class Methods {
    public static void main(String[] args) {
        int[] a = { 44, 64, 22, 45, 66 };
        // System.out.println(sumOfArray(a));
        int r = sumOfArray(a);
        System.out.println(r);

        String str = upperCase("  rushi  ");
        System.out.println(str);

        System.out.println(sum(33, 44));
        System.out.println(sum(22, 53, 55));
    }

    public static int sumOfArray(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        return res;

    }

    public static String upperCase(String str) {
        return str.trim().toUpperCase();
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}