package com.Patterns;

import java.util.Scanner;

public class Suvarna3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string:");
		String s = sc.nextLine();
		char ch[]=s.toCharArray();
		System.out.println("enter a character:");
		char ch1=sc.next().charAt(0);
		for(int i=0;i<ch.length;i++) {
			if(ch1==ch[i]) {
				System.out.println("The position of the character:"+i);
				break;
			}
		}
	}

}
