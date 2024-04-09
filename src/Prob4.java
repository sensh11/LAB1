public class Prob4 {

    public static int Factorial(int n){
        if(n==0) return 1;
        return  n *Factorial(n-1);
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(Factorial(n));

    }
}