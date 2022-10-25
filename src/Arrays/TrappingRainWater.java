package Arrays;

import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum rain water can be trapped : " + trappingRainWater(arr));
    }
    public static int trappingRainWater(int []arr){
        int res = 0 , n = arr.length;
        for(int i=1;i<n-1;i++){
            int lmax = arr[i] , rmax = arr[i];
            for(int j=0;j<i;j++){
                lmax = Math.max(lmax , arr[j]);
            }
            for(int j=i+1;j<n;j++){
                rmax = Math.max(rmax , arr[j]);
            }
            res = res + Math.min(lmax , rmax) - arr[i];
        }
        return res;
    }
}
