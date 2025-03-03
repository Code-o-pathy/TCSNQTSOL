//sum of all array elements;
public class qn3{
    public static void main(String[] args) {
        int arr[]={12,13,98,8921,2198,299};
        int ans=recur(arr);
        System.out.println(ans);
    }
    public static int recur(int arr[]){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
}
