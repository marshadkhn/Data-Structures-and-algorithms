import java.util.*;

public class LinearSearch {
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
        int LS = LinearSearch(array, searchElement);
        System.out.println(LS);

    }

    public static int LinearSearch(int[] arr, int target) {
        if(arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) return i;
        }
        return -1;
    }
}
