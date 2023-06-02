package com.Patterns;

public class Program4 {

	public static void main(String[] args) {
		int value=100;
		int value1=value==100?50:10;
		System.out.println("value1:"+value1);
		System.out.println("value2:");
		String value2=value>=value1?" greater":"lesser";
		System.out.println(value2);

	}

}
