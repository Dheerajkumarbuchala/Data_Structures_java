package Arrays;

import java.util.Scanner;

public class FrequenciesInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        frequency(arr);
    }
    public static void frequency(int [] arr){
        int count = 1 , n = arr.length,i = 1;
        while(i < n) {
            while (i < n && arr[i - 1] == arr[i]) {
                count++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + count);
            count = 1;
            i++;
        }
        if (n == 1 || arr[n - 2] != arr[n - 1]) {
            System.out.println(arr[n - 1] + " " + 1);
        }
    }
}
