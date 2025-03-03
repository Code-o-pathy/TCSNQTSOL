//remove duplicate characters from string
import java.util.HashSet;
import java.util.Scanner;
public class qn6 {
    public static void main(String args[]){
        System.out.print("Enter any string with duplicate characters: ");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String res=recur(text);
        System.out.println(res);
    }
    public static String recur(String text){
        HashSet<Character> set=new HashSet<>();
        StringBuilder str=new StringBuilder();
        for(char c:text.toCharArray()){
            if(set.contains(c) || set.contains(Character.toLowerCase(c))){
                continue;
            }
            else{
                set.add(Character.toLowerCase(c));
                str.append(c);
            }
        }
        return str.toString();
    }

    
}
