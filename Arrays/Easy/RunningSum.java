
// 1480 : running sum of 1D arrays
import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] temp1 = runningSum(arr);

        // in the format of Arrays
        System.out.println(Arrays.toString(temp1));

        // in one line, but not in the form of Arrays
        for (int i = 0; i < temp1.length; i++) {
            System.out.print(temp1[i]+" ");
        } 
    }

    static int[] runningSum(int[] nums) {
        // int[] temp = new int[nums.length];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=0; j<=i; j++){
        //         temp[i] += nums[j];
        //     }
        // }
        // return temp;
        for(int i=0; i<nums.length; i++){
            if(i>0){
                nums[i] += nums[i-1];
            }
            // nums[i] = nums[i-1];
        }
        return nums;
    }
}
