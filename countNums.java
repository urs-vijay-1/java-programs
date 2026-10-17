package javaPrograms;

import java.util.Scanner;

public class countNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number it has many same numbers (ex:1222434) : ");
        long n = sc.nextLong();
        System.out.print("Enter a number to find (ex : 2) : ");
        int fnum = sc.nextInt();
        int count = 0;
        while(n>0){
            long rem = n%10;
            if (rem == fnum){
                count++;
            }
            n = n/10;
        }
        System.out.print("how many times the number is present : "+ count);
    }
}
