package Arrays;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The second largest element in the array : " + secondLargestElement(arr));
    }
    public static int secondLargestElement(int [] arr){
        int n = arr.length;
        int f = arr[0] , s = arr[0];
        for(int i=1;i<n;i++){
            if(f < arr[i]){
                s = f;
                f = arr[i];
            }
        }
        return s;
    }
}
