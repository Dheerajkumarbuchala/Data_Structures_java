package Arrays;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Max consecutive 1's : " + maxConsecutiveOnes(arr));
    }
    public static int maxConsecutiveOnes(int [] arr){
        int n = arr.length , count = 0 , res = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=1){
                count = 0;
            }
            count = count + 1;
            res = Math.max(res , count);
        }
        return res;
    }
}
