package com.Patterns;

import java.util.Scanner;

public class MaximunAndMinumunInarray {

	public static void main(String[] args) {
		int max=0;
		Scanner sc=new Scanner(System.in);
//		System.out.println(" Enter a Numbers To Find Maximun And Minumum values: ");
//		int a=sc.nextInt();
		System.out.println("Enter a Size Of An Array: ");
//		int b=sc.nextInt();
		
		int size =sc.nextInt();
		System.out.println(" Enter a Numbers To Find Maximun value: ");
		int c[]=new int[size];
		for(int i=0;i<c.length;i++) {
			c[i]=sc.nextInt();
		}
		int min=0;
		for(int j=0; j<c.length;j++) {
			if(c[j]>max) {
				max=c[j];
			}
//			else if(c[j]<min) {
//				min=c[j];
//			}
		}
		System.out.println(" The Largest Number is:"+max);

		}
		
	}


