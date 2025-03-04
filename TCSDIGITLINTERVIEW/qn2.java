
//checking if the array contains duplicate elements;
import java.util.*;

public class qn2 {
    public static void main(String[] args) {
        int arr[] = { 1221, 4, 4, 122, 433, 1211, 121, 211 };
        boolean ans = recur(arr);
        System.out.println(ans);
    }

    public static boolean recur(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i)) {
                System.out.println(i + " is repeated");
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }

}
