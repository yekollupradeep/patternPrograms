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
		String str="SASHI";
		int len=str.length();
		for ( int i=0; i< len; i++) {
			for (int j=0;j<len;j++) {
				if(i==len/2) {
					System.out.print(str.charAt(j)+" ");
				}
				else if(j==len/2) {
					System.out.print(str.charAt(i)+" ");
				}
				else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if(i==3) {
				System.out.print(j);
			}
		}
	}
}
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(i==len/2) {
//					System.out.print(str.charAt(i));
//				}
//				else if(j==len/2) {
//					System.out.print(str.charAt(j));
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//	}


