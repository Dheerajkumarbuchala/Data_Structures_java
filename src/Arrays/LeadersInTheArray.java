package Arrays;

import java.util.Scanner;

public class LeadersInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        leaders(arr);
    }
    public static void leaders(int []arr){
        int n = arr.length , m = arr[n-1];
        System.out.print(m + " ");
        for(int i=n-2;i>=0;i--){
            if(m < arr[i]){
                m = arr[i];
                System.out.print(m + " ");
            }
        }
    }
}
