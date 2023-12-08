package StriverA2Z.recursion;

import java.util.Scanner;

//With and without array
public class onetoNWithoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        System.out.print("Numbers are: ");
        withoutArray(x);
    }
    public static void withoutArray(int x) {
        //base condition
        if (x > 0) {
            withoutArray(x - 1);//recursion
            System.out.print(x + " ");
        }
    }
}
