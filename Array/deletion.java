import java.util.*;

public class deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of array");
        int input = sc.nextInt(); //Taking input of number of elements
        int[] array = new int[input];  
        System.out.println("Enter the elements of array"); //Elements of array
        for (int i = 0; i < input; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < input; i++) {
            System.out.println(array[i]+" ");
        }
         
        System.out.println("Enter the element you want to remove");
        int removeElement = sc.nextInt(); //Input of removeElement
        int n = removeElement(array, removeElement);
        
        System.out.println("Array elements after removing the desired one: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
    }

    //Deletion in array
    public static int removeElement(int arr[], int element) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (element == arr[i]) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
        return n = n - 1;
    }

    
}
