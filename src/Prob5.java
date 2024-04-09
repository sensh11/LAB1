public class Prob5 {

    public static int Fibonachi(int n){
        if(n==1)return 1;
        else if(n==2) return 1;
        return Fibonachi(n-1)+Fibonachi(n-2);

    }

    public static void main(String[] args) {
        int n =17;
        System.out.println(Fibonachi(n));
    }
}
