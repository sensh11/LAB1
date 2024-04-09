

public class Prob1 {

    public static int Minimum(int[] arr, int n) {

        if (n == 1) {
            return arr[0];
        }

        int minInArr = Minimum(arr, n - 1);

        return Math.min(minInArr, arr[n - 1]);
    }

    public static void main(String[] args) {
        int[] array = {8, 9, 3, 1, 2};
        int n = array.length;
        int min = Minimum(array, n);
        System.out.println(min);
    }
}