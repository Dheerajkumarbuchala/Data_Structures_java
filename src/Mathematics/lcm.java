package Mathematics;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two positive integers to find LCM : ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("LCM of "+ a + "," + b + " : " + (a * b)/(gcd.hcf(a,b)));
    }
}
