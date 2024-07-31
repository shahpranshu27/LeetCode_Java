package Basic_Maths;

public class Rev_num {
    public static void main(String[] args) {
        int n = 1234;
        reverse(n);
    }

    public static void reverse(int n){
        int r=0;
        while(n>0){
            int rem = n%10;
            r = r*10 + rem;
            n = n/10;
        }
        System.out.println(r);
    }
}
