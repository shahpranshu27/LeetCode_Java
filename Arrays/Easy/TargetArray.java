package Arrays.Easy;

import java.util.Arrays;

// 1389 : Create a target array in the given order
public class TargetArray {

    static int[] target(int[] nums, int[] index){

        int[] target = new int[nums.length];
		int count = 0;
		while (count < target.length) {
            if (index[count] >= count) {
				target[index[count]] = nums[count];
			}
            else{
				for (int i = target.length - 1; i > index[count]; i--)
					target[i] = target[i - 1];
				target[index[count]] = nums[count];
			}
			count++;
		}
        return target;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        target(arr, index);
        System.out.println(Arrays.toString(target(arr, index)));
    }
}
