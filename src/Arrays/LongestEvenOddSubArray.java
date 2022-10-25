package Arrays;

import java.util.Scanner;

public class LongestEvenOddSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Length of longest even odd subarray : " + longestEvenOddSubArray(arr));
    }
    public static int longestEvenOddSubArray(int []arr){
        int n = arr.length , count = 1 , res = 1;
        for(int i=0;i<n-1;i++){
            if((arr[i]%2==0 && arr[i+1]%2!=0) || (arr[i]%2!=0 && arr[i+1]%2==0)){
                count = count + 1;
                res = Math.max(res , count);
            }
            else{
                count = 1;
            }
        }
        return res;
    }
}
