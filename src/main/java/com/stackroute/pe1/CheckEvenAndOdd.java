package com.stackroute.pe1;
import java.util.*;
public class CheckEvenAndOdd {
    //public static void main(String args[]) {
       // Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
    public static String checkEvenAndOdd(int number){
        if (number > 20 && number <= 30) {
            if (number % 2 == 0) {
                return "tom";
            } else {
                return "jerry";
            }
        } else {
            return "not in range";
        }
    }
}



