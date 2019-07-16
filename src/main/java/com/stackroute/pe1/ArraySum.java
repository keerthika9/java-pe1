package com.stackroute.pe1;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        number = scanner.nextInt();
        int a[] = new int[number];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < number; i++) {
            a[i] = scanner.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:" + sum);
    }
}