package javaPrograms;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        System.out.print("Enter operator (Ex:+,-,*,/,%): ");
        Scanner sc = new Scanner(System.in);
        char operator = sc.next().trim().charAt(0);

        System.out.print("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        switch (operator) {
            case '+' -> System.out.println("sum is " + (n1 + n2));
            case '-' -> System.out.println("sub is " + (n1 - n2));
            case '*' -> System.out.println("mul is " + (n1 * n2));
            case '/' -> {
                if (n2 != 0) {
                    System.out.println("div is " + (n1 / n2));
                }
            }
            case '%' -> System.out.println("rem is " + (n1 % n2));
            default -> System.out.println("Invalid operator");
        }
    }
}