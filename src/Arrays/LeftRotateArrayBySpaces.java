package Arrays;

import java.util.Scanner;

public class LeftRotateArrayBySpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter by how many spaces we have to rotate the array : ");
        int m = sc.nextInt();
        leftRotateByN(arr,m%n);
        System.out.print("Array after rotation by " + m + " spaces : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void leftRotateByN(int []arr,int m){
        int l = 0,h = m-1,n = arr.length;
        while(l < h){
            int k = arr[l];
            arr[l] = arr[h];
            arr[h] = k;
            l++;
            h--;
        }
        l = m;
        h = n-1;
        while(l < h){
            int k = arr[l];
            arr[l] = arr[h];
            arr[h] = k;
            l++;
            h--;
        }
        l = 0;
        h = n-1;
        while(l < h){
            int k = arr[l];
            arr[l] = arr[h];
            arr[h] = k;
            l++;
            h--;
        }
    }
}
