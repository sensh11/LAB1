public class Prob10 {

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 32;
        int b = 48;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}