package com.Patterns;

import java.util.Scanner;

public class Varaible {
	public void pupAge() {
	      int age = 5;
	      age = age + 7;
	      System.out.println("Puppy age is : " + age);
	     Scanner sc=new Scanner(System.in);
	     System.out.println(" Enter a Height of Dog:");
	     double a=sc.nextDouble();
	     System.out.println("heigth of dog:"+a+"cm");
	     
	      
	      
	   }

	   public static void main(String args[]) {
	      Varaible var = new Varaible();
	      var.pupAge();
	   }
	}


