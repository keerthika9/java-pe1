package com.stackroute.pe1;
import java.util.*;
public class StringRepeat {
    public static void main(String[] args){
        int len;
        Scanner sc= new Scanner(System.in);
        String g= sc.next();
        Scanner sc1= new Scanner(System.in);
        int n= sc1.nextInt();
        String x ="";
        String d="";
        len=g.length();
        for(int i=0;i<n;i++){
            for(int j=len-n;j<g.length();j++)
            {
                x=x+(g.charAt(j));}
        }
        System.out.println(g+x);

    }
}