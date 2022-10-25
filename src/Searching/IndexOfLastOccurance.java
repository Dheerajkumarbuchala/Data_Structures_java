package Searching;

import java.util.Scanner;

public class IndexOfLastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to find the index of last occurance : ");
        int m = sc.nextInt();
        System.out.println("The index of the last occurance of element " + m + " is : " + indexOfLastOccurance(arr,m,n));
    }
    public static int indexOfLastOccurance(int []arr,int m,int n){
        int l = 0,h = n-1;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr[mid] > m){
                h = mid - 1;
            }
            else if(arr[mid] < m){
                l = mid + 1;
            }
            else if(arr[mid]==m){
                if(mid==n-1 || arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else{
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}
