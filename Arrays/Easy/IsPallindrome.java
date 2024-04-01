
public class IsPallindrome {
    
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));       
    }

    static boolean isPalindrome(int x) {
        int reversed = 0;
    int maxInt = Integer.MAX_VALUE;
    int minInt = Integer.MIN_VALUE;

    while (x != 0) {
        int digit = x % 10;

        // Check for overflow before multiplication
        if (reversed > maxInt / 10 || (reversed == maxInt / 10 && digit > 7)) {
            return false; // Handle overflow for positive numbers
        }
        if (reversed < minInt / 10 || (reversed == minInt / 10 && digit < -8)) {
            return false; // Handle overflow for negative numbers
        }

        reversed = reversed * 10 + digit;
        x /= 10;
    }

    return reversed != x;
    
}
}

