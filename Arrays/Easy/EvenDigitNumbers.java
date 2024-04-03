package Arrays.Easy;

public class EvenDigitNumbers {
    static int findNumbers(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if((arr[i]>9 & arr[i]<100) || (arr[i]>999 && arr[i]<10000) || arr[i] == 100000){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
}
