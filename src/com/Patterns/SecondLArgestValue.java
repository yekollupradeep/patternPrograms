package com.Patterns;

import java.util.Arrays;

public class SecondLArgestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,6,9,8,3};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-2]);

	}


	}


