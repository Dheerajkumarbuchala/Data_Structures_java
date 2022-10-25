package Mathematics;

import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number to count the digits : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n==0){
            System.out.println("No of digits : 0");
        }
        else if(n<0){
            System.out.println("No of digits : " + count_the_digits(-n));
        }
        else{
            System.out.println("No of digits : " + count_the_digits(n));
        }
    }
    public static int count_the_digits(int n){
        int count = 0;
        while(n > 0){
            count = count + 1;
            n = n / 10;
        }
        return count;
    }
}
