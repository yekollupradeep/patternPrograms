package com.Patterns;

import java.util.Scanner;

public class ReversewithOutUsingStringMethods {

	public static void main(String[] args) {
		StringBuilder str2=new StringBuilder();
		String str1= " Pradeep";
		
		
		str2.append(str1);
		str2=str2.reverse();
        System.out.println("The Reversed String Is:"+str2);
	}

}
