package Arrays.Easy;

// 1365 : how many numbers are smaller than the current number
import java.util.Arrays;

public class SmallerNumber {
    static int[] small(int[] arr){
        // brute force : 
        // int[] arr1 = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     int count = 0;
        //     for (int j = 0; j < arr.length; j++) {
        //         if(arr[j] < arr[i] && j!=i){
        //             count++;
        //         }
        //         arr1[i] = count;
        //     }
        // }
        // return arr1;

        // optimised solution
        // creating a bucket for counting sort
        int[] bucket = new int[100];

        // get frequency of each element
        for (int i : arr) {
            bucket[i]++;
        }

        // count smaller numbers than each element i.e. cumilative sum from 1 to arr.length, where we start adding value at index 0 in index 1, index 1 in index 2 and so on.... 
        for (int i = 1; i < bucket.length; i++) {
            bucket[i] += bucket[i-1];
        }

        // populate the result
        int[] result = new int[arr.length];

        for (int i = 0; i < result.length; i++) {
            if(arr[i] == 0){
                result[i] = 0;
            }
            else{
                result[i] = bucket[arr[i]-1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] arr = {8,1,2,2,3};
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(small(arr)));
    }
}
