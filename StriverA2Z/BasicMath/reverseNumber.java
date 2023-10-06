package StriverA2Z.BasicMath;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 123;
        int ans = reverse(n);
        System.out.println(ans);
    }

    public static int reverse(int n) {
        int x = n;
        int reverse = 0;
        while (x != 0) {
            int d = x % 10;
            reverse = (reverse * 10) + d;
            x = x / 10;
        }
        return reverse;
    }
}
