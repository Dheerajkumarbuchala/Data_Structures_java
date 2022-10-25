package Searching;

import java.util.Scanner;

public class CountOccurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to count the occurances : ");
        int m = sc.nextInt();
        countOccurances(arr, m);
    }

    public static void countOccurances(int[] arr, int m) {
        int n = arr.length;
        if (IndexOfFirstOccurance.indexOfFirstOccurance(arr, m, n) == -1) {
            System.out.println("The element " + m + " is not present in the array");
        }
        System.out.println("No of occurances of element " + m + " is : " +
                (IndexOfLastOccurance.indexOfLastOccurance(arr, m, n) -
                        IndexOfFirstOccurance.indexOfFirstOccurance(arr, m, n) + 1));
    }
}
