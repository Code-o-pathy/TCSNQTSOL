public class qn4 {
    public static void main(String args[]){
        int arr[]={12,14,34,39,43,46,49,51,70,80};
        int ans=binarySearch(arr,43);
        System.out.println(ans);
    }
    public static int binarySearch(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
