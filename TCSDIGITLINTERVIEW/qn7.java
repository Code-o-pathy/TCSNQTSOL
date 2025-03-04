//move all the 0s to end while maintaining their relative order
public class qn7 {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 12, 0, 13, 14, 15, 16 };
        recur(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void recur(int arr[]) {
        int low=-1;
        int high=0;
        while(high<arr.length){
            if(arr[high]!=0){
                low++;
                arr[low]=arr[high];
            }
            high++;
        }
        low++;
        while(low<arr.length){
            arr[low++]=0;
        }

    }

}
