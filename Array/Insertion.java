import java.util.*;
import java.io.*;
public class Insertion {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int elementsInput = sc.nextInt();
        int[] array = new int[elementsInput];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < elementsInput; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.println("Array elements before insertion");
        for (int i = 0; i < elementsInput; i++) {
            System.out.println(array[i] + " ");
        }

        System.out.println("Enter the element you want to enter");
        int element = sc.nextInt();
        System.out.println("Enter the position of the element at which you want to enter");
        int position = sc.nextInt();
        System.out.print("Array elements after insertion: ");
        int n = Insertion(array, position, element);
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static int Insertion(int[] arr, int pos, int element) {
        int n = arr.length;
        int newArr[] = new int[n+1];
        for(int i = 0; i<arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = n; i > pos - 1; i--) {
            newArr[i] = newArr[i - 1];
        }
        newArr[pos - 1] = element;
        for (int i = 0; i < n + 1; i++) {
            System.out.print(newArr[i] + " ");
        }
        return 0;
    }
}
