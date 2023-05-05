package com.Patterns;

import java.util.Scanner;

public class DistinctElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence:");
		String s = sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int count=1;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					i++;
				}
			}
			if(count==1) {
				System.out.println(ch[i]+" is available:"+count);
			}
		}
	}



	}


