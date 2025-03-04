import java.util.*;

public class qn1 {
    public static void main(String args[]) {
        System.out.print("Enter the target: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = { 12, 21, 32, 33, 42, 54, 36, 75, 56, 48, 80 };
        int ans[] = recur(arr, n);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
    public static int[] recur(int arr[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                return new int[]{i,map.get(target-arr[i])};
            }
        }
        return new int[]{-1,-1};
    }

}
