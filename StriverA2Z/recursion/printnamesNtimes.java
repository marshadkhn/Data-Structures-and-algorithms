package StriverA2Z.recursion;

public class printnamesNtimes {
    public static void main(String[] args) {
        int n = 4;
        printName(1,n);
    }
    public static void printName(int i, int n){
        if(i>n) return;
        System.out.println("ARSHAD");
        printName(1+i,n);
    }
}
