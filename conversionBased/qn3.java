import java.util.Scanner;

public class qn3 {
    public static void main(String args[]){
        System.out.print("Enter the temperature in Farenheit: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float ans=recur(n);
        System.out.println(ans+" °C");
    }
    public static float recur(int n){
        float ans=(n-32)*((float)5/(float)9);
        System.out.println(ans);
        return ans;
    }
}
