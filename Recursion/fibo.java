package Recursion;

public class fibo {
    public static void main(String[] args) {
        System.out.println(printingfibo(90));
    }

    public static int printingfibo(int n) {
        if(n < 2) return n;
        return printingfibo(n-1)+printingfibo(n-2);

    }
}
