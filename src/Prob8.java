public class Prob8 {

    public static boolean isDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }

        char currentChar = s.charAt(index);
        if (Character.isDigit(currentChar)) {
            return isDigits(s, index + 1);
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        String s1 = "12345";
        String s2 = "12a45";


        System.out.println("String s1 consists only of digits: " + isDigits(s1, 0));
        System.out.println("String s2 consists only of digits: " + isDigits(s2, 0));
    }
}
