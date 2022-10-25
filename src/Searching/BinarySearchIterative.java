package Searching;

import java.util.Scanner;

public class BinarySearchIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search : ");
        int m = sc.nextInt();
        if(binarySearch(arr , m) == -1){
            System.out.println("Element is not present in the array.");
        }
        else{
            System.out.println("Element is present at index : " + binarySearch(arr , m));
        }
    }
    public static int binarySearch(int []arr , int m){
        int pos = -1 , n = arr.length, l = 0 , h = n-1;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr[mid] == m){
                return mid;
            }
            else if(arr[mid] > m){
                h = mid - 1;
            }
            else if(arr[mid] < m){
                l = mid + 1;
            }
        }
        return -1;
    }
}
