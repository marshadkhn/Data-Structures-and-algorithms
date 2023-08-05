//Not from striver sheet this is mine practice question
//Question - Find the smallest number in array
package StriverA2Z.Array.Easy;

public class smallestElement {
    //Doing it with bubble sort
    static void smallestNumber(int[] arr){
        //Applying bubble sort to sort the array so that we get the smallest element at first
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        //Printing the last element
        System.out.println("Smallest element is - " + arr[0]);
    }
    public static void main(String[] args) {
        int[] arr = {1,9,13,0,2};
//        int n = smallestNumber(arr);
//        System.out.println(smallestElement(arr));
        System.out.println("ARSHAD");
        smallestNumber(arr);
    }
}
