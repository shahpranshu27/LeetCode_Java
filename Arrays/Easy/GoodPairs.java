
// 1512 : number of good pairs
/*
good pairs are those, where arr[i] == arr[j] && i<j
 */
public class GoodPairs {
    static int good(int[] arr){
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[i] == arr[j] && i<j){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        // creating a frequency counting array for each elements
        int[] count = new int[100];

        for (int num : arr) {
            count[num]++;
        }

        int totalCount = 0;

        for (int i : count) {
            totalCount += ((i)*(i-1))/2;
        }
        return totalCount;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        System.out.println(good(arr));
    }
}
