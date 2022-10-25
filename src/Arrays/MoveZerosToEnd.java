package Arrays;

import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        moveZerosToEnd(arr);
        System.out.println("Array after moving zeros to the end : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void moveZerosToEnd(int [] arr){
        int pos = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int k = arr[i];
                arr[i] = arr[pos];
                arr[pos] = k;
                pos++;
            }
        }
    }
}
