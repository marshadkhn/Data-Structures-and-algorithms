package StriverA2Z.recursion;

public class NtoOne {
    public static void main(String[] args) {
        int n =4;
        reverse(n,n);
    }
    public static void reverse(int i, int n){
        //base condition
        if(i<1) return;
        System.out.println(i);
        reverse(i-1,n);
    }
}
