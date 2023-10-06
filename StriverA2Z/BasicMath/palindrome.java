package StriverA2Z.BasicMath;

public class palindrome {
    public static void main(String[] args) {
        int n = 1221;
        palindromeNumber(n);


    }
    public static int palindromeNumber(int n) {
        int x = n;
        int reverse = 0;
        while (x != 0) {
            int d = x % 10;
            reverse = (reverse * 10) + d;
            x = x / 10;
        }
        if(n == reverse) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
        return 0;
    }
}
