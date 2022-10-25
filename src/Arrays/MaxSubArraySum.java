package Arrays;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum sub array sum : " + maxSubArraySum(arr));
    }
    public static int maxSubArraySum(int [] arr){
        int n = arr.length, s = arr[0] , res = arr[0];
        for(int i=1;i<n;i++){
            s = Math.max(s + arr[i] , arr[i]);
            res = Math.max(s , res);
        }
        return res;
    }
}
