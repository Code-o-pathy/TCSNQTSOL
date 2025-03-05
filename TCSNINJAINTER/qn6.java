//second largest
//in previous sections I used Priority Queue to find nth largest number, since heere we just need the 2nd largest i used different approach, Although this too can be solved by priority queue.
public class qn6 {
    public static void main(String args[]){
        int arr[]={12,58,13,14,17,21,31,32,45,56};
        int ans=recur(arr);
        System.out.println(ans);
    } 

    public static int recur(int arr[]){
        int max=arr[0];
        int min=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=max){
                min=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>min){
                min=arr[i];                
            }
        }
        return min;
    }   
}

//freq of every character in string qn5
//check if a number is a perfect numebr qn7
//already solved in previous sections

