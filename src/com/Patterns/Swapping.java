package com.Patterns;

import java.util.Arrays;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="pradeep";
		char ch[]=s.toCharArray();
		int start=0;
		int end=ch.length-1;
		for(int i=0;i<ch.length;i++) {
			if(start<end) {
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			}
		}
		System.out.println(Arrays.toString(ch));
	}




	}

