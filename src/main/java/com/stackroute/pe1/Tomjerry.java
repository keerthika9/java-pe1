package com.stackroute.pe1;
import java.util.*;
public class Tomjerry {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 20 && n <= 30) {
            if (n % 2 == 0) {
                System.out.println("tom");
            } else {
                System.out.println("jerry");
            }
        } else {
            System.out.println("not in range");
        }
    }
}



