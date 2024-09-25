//  Write a Java program to sort a numeric array in java
// using a short method

import java.util.Arrays;
public class ArrayQuestion1 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,3,2,6,8,9,6};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}


//  Write a Java program to sum values of an array.
/*
public class ArrayQuestion1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
 */

// Write a Java program to calculate the average value of array elements.
