//Question - Find the second largest element in an array
package StriverA2Z.Array.Easy;

public class SecondLargest {
    //Solving by my approach
    static void myWay(int[] arr){
        //Sorting array by bubble sort
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
        System.out.println("Second largest element - "+ arr[n - 2]);
    }
    public static void main(String[] args) {
        int[] arr = {0,2,8,1};
        myWay(arr);
    }
}
