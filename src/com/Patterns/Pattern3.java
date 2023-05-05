package com.Patterns;

public class Pattern3 {
	/*
	 1 0 1 0 1
	 0 1 0 1 0
	 1 0 1 0 1
	 0 1 0 1 0
	 1 0 1 0 1
	 
	 */
	public static void main(String[] args) {
		int num=5;
		for( int i=0;i<5;i++) {
			for(int j=0;j<5;j++){
				if((i+j)%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
	}

}
