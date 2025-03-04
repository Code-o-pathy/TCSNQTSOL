//maximum sum subarray (kadanes algorithm);
import java.util.*;
public class qn8 {
    public static void main(String args[]){
        int arr[]={2,3,4,-9,2,3,4,-1,2,7};
        int ans=recur(arr);
        System.out.println(ans);
    }    
    public static int recur(int arr[]){
        int res=0;
        int curr=0;
        for(int i:arr){
            curr=Math.max(i+curr,i);
            res=Math.max(res,curr);
        }
        return res;
    }
}
