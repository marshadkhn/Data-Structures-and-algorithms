import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int elements = sc.nextInt();
        int[] array = new int[elements];
        System.out.println("Enter the elments of array");
        for (int i = 0; i < elements; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("If element is not present you will get -1");
        System.out.println("Enter the element you want to search");
        int searchElement = sc.nextInt();
        int LS = BinarySearch(array, searchElement);
        System.out.println(LS);
    }

    public static int BinarySearch(int[] arr, int target ) {
        int start = 0, end = arr.length - 1;
        while(start >= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]) start = mid + 1;
            else if(target > arr[mid]) end = mid - 1;
            else return mid;
        }
        return -1;
    }

}
