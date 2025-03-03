//count freq of all the characters
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class qn3 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        recur2(text);
    }

    public static void recur(String text) {
        //naive approach
        int arr[] = new int[26];
        for (char i : text.toCharArray()) {
            arr[(int) (i - 97)]++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                System.out.println((char)(i+97)+"-> "+arr[i]);
            }
        }

    }
    public static void recur2(String text){
        //this approach is best but it does not guarrantee order of characters in output
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:text.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"-> "+entry.getValue());
        }
    }
}
