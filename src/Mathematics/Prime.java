package Mathematics;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if prime or not : ");
        int n;
        n = sc.nextInt();
        System.out.println(n + " is prime : " + check_if_prime(n));
    }
    public static boolean check_if_prime(int n){
        if(n<2){
            return false;
        }
        int count = 0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                count++;
            }
        }
        return (count == 0);
    }
}
