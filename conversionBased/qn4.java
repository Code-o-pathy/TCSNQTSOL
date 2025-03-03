//string to num
import java.util.Scanner;
public class qn4 {
    public static void main(String[] args) {
        System.out.print("Enter a string of digits: ");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int ans=recur(text);
        System.out.println(ans);
    }
    public static int recur(String text){
        int ans=0;
        for(char c:text.toCharArray()){
            ans=(ans*10)+(int)(c)-48;
        }
        return ans;
    }
}
