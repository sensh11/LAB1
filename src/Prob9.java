public class Prob9 {

    public static long binom(int n, int k)
    {
        if (k==n || k==0)
            return 1;
        else return binom(n-1,k-1) + binom(n-1, k);
    }

    public static void main(String[] args) {
        int n =7;
        int k=3;
        System.out.println(binom(n ,k));
    }
}
