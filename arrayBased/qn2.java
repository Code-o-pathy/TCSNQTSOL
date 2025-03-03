//array rotation by K elements
import java.util.Scanner;
public class qn2 {
    public static void main(String[] args) {
        int arr[]={2,32,12,10,121,23,7};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter K: ");
        int k=sc.nextInt();
        int ans[]=recur(arr,k);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    public static int[] recur(int arr[],int k){
        int n=arr.length;
        if(k%n==0 || n==0){
            return arr;
        }
        int ans[]=new int[n];
        for(int i=0;i<n-k;i++){
            ans[i]=arr[k+i];
        }
        for(int i=0;i<k;i++){
            ans[n-k+i]=arr[i];
        }
        return ans;
    }
}