package com.Patterns;

import java.util.Scanner;

public class DuplicatesvaluesInArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a size of array:");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println(" Enter a Elements in array to get duplicates values:");
	    for(int i=0;i<a.length;i++) {
	    	a[i]=sc.nextInt();
	    }
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(" Duplicates Values in array is:"+a[i]);
				}
			}
		}

	}

}
