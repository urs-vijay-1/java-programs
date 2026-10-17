package javaPrograms;

import java.util.Arrays;
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int[] nums = new int[5];
//
//      nums[0] = 1;
//        nums[1] = 23;
//        nums[2] = 4;
//        nums[3] = 67;
//        nums[4] = 45;
//
//        System.out.println(nums[3]);
//
//        //inputs using for loop
//
//        for (int i=0; i<nums.length; i++){
//            nums[i] = sc.nextInt();
//        }
//
//    System.out.print(Arrays.toString(nums));
//
//          for (int n : nums){
//              System.out.print(n + " ");
//          }

        //arrays with objects
        String[] arr = new String[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));

        // modify

        arr[1] = "vijay";
        System.out.print(Arrays.toString(arr));


    }
}
