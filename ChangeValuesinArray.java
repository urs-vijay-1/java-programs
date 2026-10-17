package javaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeValuesinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[4];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(n));
    }

    static void change(int[] arr) {
        arr[2] = 23;
    }
}
