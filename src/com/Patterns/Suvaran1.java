package com.Patterns;

import java.util.Scanner;

public class Suvaran1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			sum=num%10+sum;
			num=num/10;
		}
		System.out.println(sum);

	}

}
