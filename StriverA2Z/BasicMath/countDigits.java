package StriverA2Z.BasicMath;

public class countDigits {
    public static void main(String[] args) {
        int arr = 12345;
        int ans = countDigit(arr);
        System.out.println(ans);

    }
    public static int countDigit(int n){

        int count = 0;
        int x = n;
        while(x!=0){
            x = x/10;
            count++;
        }
        return count;
    }
}
