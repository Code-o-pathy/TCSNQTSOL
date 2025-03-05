//check if array is sorted
public class qn1{
    public static void main(String args[]){
        int arr[]={12,13,14};
        boolean ans=recur(arr);
        System.out.println(ans);
    }
    public static boolean recur(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
}