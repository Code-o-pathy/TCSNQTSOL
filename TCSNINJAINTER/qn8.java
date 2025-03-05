//factorial of a number

import java.util.Scanner;

public class qn8 {
    public static void main(String args[]) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = recur(n);
        System.out.println(ans);
    }

    public static int recur(int n) {
        if (n == 1) {
            return 1;
        }
        return n * recur(n - 1);
    }

}

//qn 9 pallindrome of a number already done in previous sections
