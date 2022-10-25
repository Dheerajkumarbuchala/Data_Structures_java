package Arrays;

import java.util.Scanner;

public class CheckIfSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is sorted : " + checkIfSorted(arr));
    }
    public static boolean checkIfSorted(int []arr){
        int n = arr.length;
        boolean res = true;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                res = false;
            }
        }
        return res;
    }
}
