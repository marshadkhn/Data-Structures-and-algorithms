//Question - Find the Largest element in an array
package StriverA2Z.Array.Easy;

public class LargestElement {
    //Solving by my approach
    static void myWay(int[] arr){
        //Applying bubble sort to sort the array so that we get the largest element at last
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
        System.out.println("Largest element is - " + arr[n - 1]);
    }

    static void striverOptimal(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest element is - " + max);
    }
    public static void main(String[] args) {
        int[] arr = {0,2,8,1};
        myWay(arr);
        striverOptimal(arr);
    }
}
