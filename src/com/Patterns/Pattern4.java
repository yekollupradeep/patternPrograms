package com.Patterns;

public class Pattern4 {
	/*
	 # # # # #
	  * * * *
	   # # #
	    * *
	     #
	 */

	public static void main(String[] args) {
	int num=5;
	for(int i=5; i>=1;i--) {
		for(int j=i;j>=i;j--) {
			
			 
				if(i>=j) {
					System.out.print(" *");
				}
				else {
					System.out.print(" #");
				}
				
			}
			System.out.println();
		}
	}
		

	}


