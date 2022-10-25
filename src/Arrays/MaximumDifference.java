package Arrays;

import java.util.Scanner;

public class MaximumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Difference : " + maxDiff(arr));
    }
    public static int maxDiff(int []arr){
        int n = arr.length, res = arr[1] - arr[0] , m = arr[0];
        for(int i=1;i<n;i++){
            res = Math.max(res , arr[i] - m);
            m = Math.min(m , arr[i]);
        }
        return res;
    }
}
