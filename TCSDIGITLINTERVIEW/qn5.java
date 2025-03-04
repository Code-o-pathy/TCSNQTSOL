//kth largest element in an array
import java.util.*;
public class qn5 {
    public static void main(String args[]){
        int arr[]={12,32,24,57,45,24,25,64,65};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
        int ans=recur(arr,k);
        System.out.println(ans);
    }
    public static int recur(int arr[], int k){
        if(k>=arr.length) return -1;
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->b-a);
        for(int i:arr){
            q.add(i);
        }
        int i=1;
        while(i<k){
            q.poll();
            i++;
        }
        return q.poll();
    }
}
