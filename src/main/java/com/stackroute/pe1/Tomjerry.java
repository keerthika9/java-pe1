package com.stackroute.pe1;
import java.util.*;
public class Tomjerry {
    //public static void main(String args[]) {
       // Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
    public static String Tomjerry(int n){
        if (n > 20 && n <= 30) {
            if (n % 2 == 0) {
                return "tom";
            } else {
                return "jerry";
            }
        } else {
            return "not in range";
        }
    }
}



