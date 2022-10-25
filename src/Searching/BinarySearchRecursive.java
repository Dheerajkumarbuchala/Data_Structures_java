package Searching;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search in the array : ");
        int m = sc.nextInt();
        if(binarySearchRecursive(arr, m) == -1){
            System.out.println("Element " + m + " is not present in the array.");
        }
        else {
            System.out.println("Element " + m + " is present at index " + binarySearchRecursive(arr, m));
        }
    }
    public static int binarySearchRecursive(int []arr , int m){
        int n = arr.length;
        return binarySearch(arr , m, 0 , n-1);
    }
    public static int binarySearch(int []arr,int m ,int l ,int h){
        if(l > h){
            return -1;
        }
        int mid = (l+h)/2;
        if(arr[mid] == m){
            return mid;
        }
        else if(arr[mid] > m){
            binarySearch(arr , m, l, mid-1);
        }
        else if(arr[mid] < m){
            binarySearch(arr , m , mid+1, h);
        }
        return -1;
    }
}
