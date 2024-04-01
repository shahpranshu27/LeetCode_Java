package Arrays.Easy;

// 1920 : build array from permutation
public class PermutationArray {
    public static void main(String[] args) {
        int[] nums = {5,0,1,4,3,2};
        buildAray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        
    }

    public static int[] buildAray(int[] nums){
        int len = nums.length;
        for(int i=0; i<len; i++){
            nums[i] = nums[i] + (len*(nums[nums[i]]%len));
        }

        for(int i=0; i<len; i++){
            nums[i] = nums[i]/len;
        }
        return nums;
    }
}
