package com.stackroute.pe1;

import java.util.ArrayList;
import java.util.*;

public class DescendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int inputNumber = scanner.nextInt();
        int sum = 0;

        for (int i = 0; inputNumber > 0; i++) {

            int buffer = inputNumber % 10;
            if (buffer % 2 == 0) {
                sum = sum + buffer;
            }
            digits.add(buffer);
            inputNumber = inputNumber / 10;
        }
        Collections.sort(digits);
        Collections.reverse(digits);
        System.out.println(digits);
        System.out.println(sum);
        if (sum > 15) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}