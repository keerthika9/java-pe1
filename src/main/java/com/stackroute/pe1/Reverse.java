package com.stackroute.pe1;


import java.util.*;
public class Reverse {
    //public static void main(String[] args) {
    public static String reverse(String OriginalString){
        String ReverseString= "";
        if(OriginalString==null)
            return "String cannot be null";

        //Scanner sc = new Scanner(System.in);
       // String g = sc.next();
        for (int j = OriginalString.length() - 1; j >= 0; j--) {
            ReverseString= ReverseString + OriginalString.charAt(j);
        }
        return ReverseString;
    }
}