//reverse a string
import java.util.Scanner;

public class qn2 {
    public static void main(String[] args) {
        System.out.print("Enter the string to be reversed: ");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String ans=recur(text);
        System.out.println(ans);
    }
    public static String recur(String text){
        StringBuilder str=new StringBuilder();
        int l=text.length()-1;
        while(l>=0){
            str.append(text.charAt(l));
            l--;
        }
        return str.toString();
    }
}
