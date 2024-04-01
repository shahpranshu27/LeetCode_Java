package Arrays.Easy;

// 1929 : Concatenation of arrays
import java.util.Arrays;

public class ConcateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] res = getConcatenation(arr);

        // prints in Array format
        System.out.println(Arrays.toString(res));

        // prints in one line form, but not in the form of Array
        // for (int i = 0; i < res.length; i++) {
        //     // System.out.print(res[i]+" ");
        // }
    }

    static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for(int i=0; i<nums.length; i++){
            result[i+nums.length] = result[i] = nums[i];
        }
        return result;
    }
}