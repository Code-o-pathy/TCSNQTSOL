//anagram check
import java.util.Arrays;

public class qn4 {
    public static void main(String[] args) {
        String s1="cccc";
        String s2="cabc";
        boolean ans=recur(s1,s2);
        System.out.println(ans);
    }
    public static boolean recur(String s1,String s2){
        int arr[]=new int[26];
        for (char i : s1.toCharArray()) {
            arr[(int) (i - 97)]++;
        }
        for (char i : s2.toCharArray()) {
            arr[(int) (i - 97)]--;
        }
        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
