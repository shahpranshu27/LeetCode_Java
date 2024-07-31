package Basic_Maths;

public class Cnt_digits {
    public static void main(String[] args) {
        int n = 1234;
        cnt(n);
    }

    public static void cnt(int n){
        int cnt=0;
        while(n>0){
            cnt+=1;
            n=n/10;
        }
        System.out.println(cnt);
    }
}
