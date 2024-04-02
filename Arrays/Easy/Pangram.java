package Arrays.Easy;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    static boolean checkPangram(String str){
        // boolean flag = false;
        // for (int i = 0; i < str.length(); i++) {
        //     if(str.charAt(i)>='a' && str.charAt(i)<='z'){
        //         flag = true;
        //     }
        // }
        // return flag;
        Set<Character> s = new HashSet<>();
        for(int i=0; i<str.length(); i++){
            s.add(str.charAt(i));
        }
        return s.size() == 26;
    }
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        checkPangram(str);
        System.out.println(checkPangram(str));
    }
}
