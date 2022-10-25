package Arrays;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n =sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        n = removeDuplicates(arr);
        System.out.println("Array after removing duplicates : ");
        for(int i=0;i<=n;i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static int removeDuplicates(int []arr){
        int res = 0, n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[res]!=arr[i]){
                res = res + 1;
                arr[res] = arr[i];
            }
        }
        return res;
    }
}
