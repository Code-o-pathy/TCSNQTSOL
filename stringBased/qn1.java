//pallindrome check
import java.util.*;

public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String to be checked: ");
        String text=sc.nextLine();
        boolean ans=recur(text);
        System.out.println(ans);
    }
    public static boolean recur(String text){
        int high=text.length()-1;
        int low=0;
        while(low<high){
            if(text.charAt(low)!=text.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}
