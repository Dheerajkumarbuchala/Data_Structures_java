package Mathematics;

import java.util.Scanner;

public class trailing_zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number to find the trailing zeros in the factorial: ");
        int n;
        n = sc.nextInt();
        System.out.println("No of trailing zeros in the factorial : " + trailingZeros(n));
    }
    public static int trailingZeros(int n){
        int res = 0;
        for(int i=5;i<=n;i=i*5){
            res = res + n/i;
        }
        return res;
    }
}
