//Question - Check Whether the array is Sorted or not
package StriverA2Z.Array.Easy;

public class CheckArraySorted {
    static boolean myWay(int[] arr){
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2,0,4,1};
        System.out.println(myWay(arr));
    }
}
