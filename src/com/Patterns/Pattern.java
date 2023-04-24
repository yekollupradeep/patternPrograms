package com.Patterns;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter a Value :");
		int a= sc.nextInt();
		for ( int i=0;i<a;i++) {
			for (int j=a-i; j>1; j--) {
				System.out.print("");
			}
			for(int k=0;k<i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
