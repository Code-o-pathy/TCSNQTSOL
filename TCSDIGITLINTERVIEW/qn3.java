//longest string without repeating character;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        // abceddabcdefghh
        String text = sc.nextLine();
        String res=recur(text);
        System.out.println(res);
    }

    public static String recur(String text) {
        String res = "";
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int n = text.length();
        StringBuilder str = new StringBuilder();
        while (i < n) {
            if (set.contains(text.charAt(i))) {
                if (str.length() > res.length()) {
                    res = str.toString();
                }
                set.clear();
                str=new StringBuilder();
                str.append(text.charAt(i));
                set.add(text.charAt(i));
                i++;
            } else {
                str.append(text.charAt(i));
                set.add(text.charAt(i));
                i++;
            }

        }
        if(str.length()>res.length()){
            res=str.toString();
        }
        return res;
    }
}
