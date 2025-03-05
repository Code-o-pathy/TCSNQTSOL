//sort an array of 0s,1s, and 2s;
//dutch national flag algorithm
public class qn10 {
    public static void main(String args[]){
        int arr[]={2,0,1,0,0,1,2,0,2,1,0};
        // {1,1,1,0,2,0,0,2,2,2,0}
        recur(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void recur(int arr[]){
        int i=0;
        int mid=0;
        int j=arr.length-1;
        while(mid<=j){
            if(arr[mid]==0){
                int temp=arr[i];
                arr[i]=arr[mid];
                arr[mid]=temp;
                i++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[j];
                arr[j]=temp;
                j--;
            }

        }
    }
}
