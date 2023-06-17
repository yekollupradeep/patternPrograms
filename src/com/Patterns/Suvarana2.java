package com.Patterns;

import java.util.Scanner;

public class Suvarana2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  First String:");
        String s = sc.next();
        System.out.println(" Enter a Second String:");
        String s1=sc.next();
        
        char ch[]=s.toCharArray();
        String s2="";
        for(int i=0;i<ch.length;i++) {
        	if(ch[i]<=57) {
        		s2=s2+ch[i];
        	}
        }
        System.out.println("The Numbers Are Present In The First String;"+s2);
       
        String s3="";
        for(int i=0;i<s1.length();i++) {
             if(s1.charAt(i)<=57) {
            	 s3=s3+s1.charAt(i);
             }
        }
        System.out.println("The numbers present in the second string"+s3);
	}

}
