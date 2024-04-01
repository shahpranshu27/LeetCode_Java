
// 1431 : kids with greatest number of candies
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class MaxCandy {
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            if(candy + extraCandies >= maxCandies){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
