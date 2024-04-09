import java.util.Scanner;

public class Prob3 {

    public static boolean isPrime(int n, int divisor) {

        if (n <= 1) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }

        if (n % divisor == 0) {
            return false;
        }

        return isPrime(n, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean isPrime = isPrime(number, number / 2);
        if (isPrime) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }
}
