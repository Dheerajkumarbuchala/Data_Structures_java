package Mathematics;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a positive number to find factorial : ");
        n = sc.nextInt();
        System.out.println("The factorial of "+ n + " : " + fact(n));
    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
