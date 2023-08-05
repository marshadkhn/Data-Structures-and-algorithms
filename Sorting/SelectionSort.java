import java.util.Arrays;
import java.util.Scanner;
//import java.lang.reflect.Array;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Your sorted array is:- ");
        selectionSort(array);
        for (int j = 0; j < n; j++) {
            System.out.println(array[j]);
        }
    }

    public static void selectionSort(int[] arr){
        int i,j;
        for (i = 0; i < arr.length - 1; i++) {
        int min = i;
            for (j = 0; j < arr.length; j++) {
                if(arr[min]> arr[j]){
                    min = j;
                }
            }
            swap(arr,arr[min],arr[j]);
        }
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
