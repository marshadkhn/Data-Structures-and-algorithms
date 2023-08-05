// Q - 1+2+3+4+5+…….+ n terms.

package NTermsQuestions;
import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want to print");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i+" ");
            int sum = (i+i);
            System.out.print(sum);
        }

    } 
}
