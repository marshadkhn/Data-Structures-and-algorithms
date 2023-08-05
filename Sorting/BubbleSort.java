import java.lang.reflect.Array;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements of array");
        int elements = in.nextInt();
        int[] array = new int[elements];
        System.out.println("Enter elements of array");
        for (int i = 0; i < elements; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Sorted array: ");
        bubbleSort(array);
        for (int i = 0; i < elements; i++) {
            System.out.println(array[i]);
        }

    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr,arr[j],arr[j-1]);
                }
            }
        }
    }

//created a separated swap function
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
