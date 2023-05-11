package com.Patterns;

import java.util.Scanner;

public class Pattern6 {
	/*     *
	  *  *
	   *
	  *  *
	*      *
	   
	 */

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a N value:");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1; j<=a;j++) {
				if(i==j||i+j==a+1) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}

}
