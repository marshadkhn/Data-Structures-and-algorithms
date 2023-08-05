// Q - +4+6+8+10+…...+ end terms

package NTermsQuestions;
import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number");
        int start = sc.nextInt();
        System.out.println("Enter the diffrence between numbers");
        int diff = sc.nextInt();
        System.out.println("Enter till where you want the sum");
        int end = sc.nextInt();

        int result = sumOfAP(start, diff, end);
        System.out.print("The sum of numbers is: "+end);

    } 
    public static int sumOfAP(int start, int diff,int end)
	{
		int sum = 0;
		for (int i = 0; i <= end; i++){
			sum = sum + start;
			start = start + diff;
		}
		return sum;
	}
}
