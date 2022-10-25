package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        System.out.print("Array after reversing : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverseArray(int []arr){
        int l = 0, h = arr.length - 1;
        while(l < h){
            int k = arr[l];
            arr[l] = arr[h];
            arr[h] = k;
            l++;
            h--;
        }
    }
}
