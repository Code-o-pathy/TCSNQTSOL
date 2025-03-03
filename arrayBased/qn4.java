//3rd maximum 
import java.util.*;
public class qn4{
    public static void main(String[] args) {
        int arr[]={12,311,121,324,3132,8981,18298,1189,198};
        int n=3; //because we want 3rd madximum;
        int ans=recur(arr,n);
        System.out.println(ans);
    }
    public static int recur(int arr[],int n){
        if(n>arr.length)return -1;
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->b-a);
        for(int i:arr){
            q.add(i);
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            ans=q.poll();
        }
        return ans;
    }
}
