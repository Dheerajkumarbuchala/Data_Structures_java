package Searching;

import java.util.Scanner;

public class CountOnesInSortedBinaryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("No of ones present in the sorted binary array are : " + countOnes(arr));
    }
    public static int countOnes(int []arr){
        int l = 0, h = arr.length - 1, n = arr.length;
        if(arr[0]==1){
            return arr.length;
        }
        else if(arr[h]==0){
            return 0;
        }
        else{
            while(l <= h){
                int mid = (l+h)/2;
                if(arr[mid]==0){
                    l = mid+1;
                }
                else if(arr[mid]==1){
                    if(arr[mid-1]==0){
                        return n-mid;
                    }
                    else{
                        h = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}
