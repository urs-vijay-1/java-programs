package javaPrograms;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse (ex:23456) :");
        long n = sc.nextLong();
        long temp = 0;
        while(n>0){
            long rem = n%10;
            temp = temp * 10 + rem;
            n = n/10;
        }

        System.out.println("Reversed number : "+ temp);
    }
}
