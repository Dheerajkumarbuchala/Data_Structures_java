package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("The largest element of the array is : " + largestElement(arr));
    }
    public static int largestElement(ArrayList<Integer>arr){
        int n = arr.size();
        int res = arr.get(0);
        for(int i=1;i<n;i++){
            if(res < arr.get(i)){
                res = arr.get(i);
            }
        }
        return res;
    }
}
