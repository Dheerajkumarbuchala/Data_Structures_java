package Arrays;

import java.util.Scanner;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of th array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        leftRotateArrayByOne(arr);
        System.out.println("Array after left rotating by one : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void leftRotateArrayByOne(int []arr){
        int n = arr.length , k = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = k;
    }
}
