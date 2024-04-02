package Arrays.Easy;

public class HighAltitude {
    // static int[] runningSum(int[] nums){
    //     for (int i = 0; i < nums.length; i++) {
    //         if(i>0){
    //             nums[i] += nums[i-1];
    //         }
    //     }
    //     return nums;
    // }

    static int altitude(int[] gains){
        // runningSum(gains);
        // int[] temp1 = runningSum(gains);
        // int[] temp = new int[1 + temp1.length];
        // temp[0] = 0;
        // for (int i = 1; i < temp.length; i++) {
        //     // if(i == 0) 
        //     temp[i] = temp1[i-1];
        // }

        // int maxi = temp[0];
        // for (int i = 0; i < temp.length; i++) {
        //     if(temp[i] > maxi){
        //         maxi = temp[i];
        //     }
        // }
        // return maxi;

        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int altitudeGain : gains) {
            currentAltitude += altitudeGain;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }
    public static void main(String[] args) {
        // int[] gains = {-5,1,5,0,-7};
        int[] gains = {-4,-3,-2,-1,4,3,2};
        System.out.println(altitude(gains));
    }
}