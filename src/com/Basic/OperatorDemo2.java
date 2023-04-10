package com.Basic;

import java.util.Scanner;

public class OperatorDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Value");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Value");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Value");
		int c=sc.nextInt();
		
		System.out.println((a>b)&&(a>c));
		System.out.println((a>b)||(a>c));

	}

}
