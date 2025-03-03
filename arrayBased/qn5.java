//bubble sort,selection sort,insertion sort
class qn5{
    public static void main(String[] args) {
        int arr[]={1};
        int ans[]=bubbleSort(arr);
        // int ans[]=insertionSort(arr);
        // int ans[]=selectionSort(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    public static int[] selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]) min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
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
