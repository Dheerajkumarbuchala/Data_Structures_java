package Mathematics;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two positive integers to find the GCD : ");
        int a , b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The GCD of "+ a +","+ b +" is : " + hcf(a,b));
    }
    public static int hcf(int a,int b){
        if(b==0)
            return a;
        return hcf(b,a%b);
    }
}
