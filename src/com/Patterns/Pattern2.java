package com.Patterns;

public class Pattern2 {
	/*
	 S 
	 A
S	A S H I
	 H
	 I
	 */

	public static void main(String[] args) {	
String s="SASHI";
for(int i=0;i<s.length();i++) {
	for(int j=0;j<s.length();j++) {
		if(j==s.length()/2) {
			System.out.print(s.charAt(i));
		}
		else if(i==s.length()/2) {
			System.out.print(s.charAt(j)+"");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
}
}

