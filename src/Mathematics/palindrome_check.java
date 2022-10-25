package Mathematics;

import java.util.Scanner;

public class palindrome_check {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number for palindrome check : ");
        n = sc.nextInt();
        System.out.println(check_palindrome(n));
    }
    public static boolean check_palindrome(int n){
        int dup = n,rev = 0;
        while(dup > 0){
            rev = rev*10 + dup%10;
            dup = dup/10;
        }
        return (rev == n);
    }
}
