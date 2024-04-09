public class Prob6 {

    public static int  power(int  a, int n) {
        if (n == 0) {
            return 1;
        }

        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        int result = power(a, n);
        System.out.println(a + " raised to the power of " + n + " is: " + result);
    }
}