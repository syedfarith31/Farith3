package org.far;

import java.util.Scanner;

public class Farith {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("Swapping number are");
		System.out.println(a);
     	System.out.println(b);		
	}
}
