
// 1470 : shuffle the array
import java.util.Arrays;

/*
 Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */
public class ShuffleArray {
    static int[] shuffle(int[] nums, int n){
        int[] res = new int[2*n]; // creating a new array of size 2n
        for(int i=0, j=n, index=0; index<res.length; i++, j++){
            res[index++] = nums[i];
            res[index++] = nums[j];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }
}
