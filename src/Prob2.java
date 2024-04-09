public class Prob2 {

    public static double Average(int [] arr, int n){
        if (n==0) return 0;


        return  arr[n-1] + Average(arr, n-1);

    }

    public static void main(String[] args) {
        int n=4;
        int [] arr={3,7,5,2};
        System.out.println(Average(arr, n)/n);
    }

}
