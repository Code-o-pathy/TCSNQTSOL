
public class qn1_2{
    public static void main(String args[]){
        int arr[]={12,2,3,4,90,21,1};
        // int ans[]=bubbleSort(arr);
        int ans[]=insertionSort(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    
    public static int[] insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;

    }
  
    public static int[] bubbleSort(int arr[]){
        int n=arr.length;
        
        for(int i=0;i<n-1;i++){
            int swaps=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            if(swaps==0){
                return arr;
            }           

        }
        return arr;
    }
}
