package StriverA2Z.BasicMath;

public class GCD {
    public static void main(String[] args) {
        //Drivers Code
        int num = 4, num2 = 8;
        int ans = 1;System.out.println(ans);
        for (int i = 1; i <= Math.min(num, num2); i++) {
            if (num % i == 0 && num2 % i == 0) {
                ans = i;
            }
        }
        System.out.println("GCD: " + ans);
    }
}

