//convert a string case;
import java.util.Scanner;

public class qn5 {
    public static void main(String[] args) {
        System.out.print("Enter a string of a-z  A-Z: ");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String ans=recur(text);
        System.out.println(ans);
    }
    public static String recur(String text){
        StringBuilder str=new StringBuilder();
        for(char c:text.toCharArray()){
            if((int)(c)>96){
                //the character is in lowercase
                int diff=(int)(c)-97;
                str.append((char)(65+diff));                
            }
            else{
                int diff=(int)(c)-65;
                str.append((char)(97+diff));
            }
        }
        return str.toString();
    }
}
