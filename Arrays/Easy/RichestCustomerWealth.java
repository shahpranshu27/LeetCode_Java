package leetcode;
// 1672 : Richest customer wealth
public class RichestCustomerWealth {
    static int maximumWealth(int[][] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int maxSum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                maxSum += arr[i][j];
            }
            res = Math.max(res, maxSum);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,21},{6,3}};   
        System.out.println(maximumWealth(arr));
    }
}
