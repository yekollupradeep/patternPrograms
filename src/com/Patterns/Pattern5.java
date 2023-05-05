package com.Patterns;

import java.util.Scanner;

/*
 
 0 
 * 1
 * * 2
 * * * 3
 * * * * 4
 * * * * * 5*/

public class Pattern5 {

	public static void main(String[] args) {
		//int n=5;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a N value:");
		int n=sc.nextInt();
		for(int i=0; i<=n;i++) {
			for(int j=0; j<=n;j++) {
				if(i==j)
				System.out.print(i);
				else if(j<=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		
			System.out.println();
		}

	}

}
