//check for leap year
import java.util.*;
class qn1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year=sc.nextInt();
        boolean ans=recur(year);
        System.out.println(ans);

    }
    public static boolean recur(int year){
        if(year%4==0){
            if(year%100==0 && year%400==0){
                return true;
            }
        }
        return false;
    }
}