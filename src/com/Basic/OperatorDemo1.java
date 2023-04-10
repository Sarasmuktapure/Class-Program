package com.Basic;

public class OperatorDemo1 {

	public static void main(String[] args) {
		int a=2;
		int b=2;
		
		int x=a++ + b++;
		System.out.println(x+" "+a+" "+b);
		
		int y=--a - ++b;
		System.out.println(y+" "+a+" "+b);
		
		int z=++a - ++b;
		System.out.println(z+" "+a+" "+b);
		
		int s=a++ + ++b;
		System.out.println(s+" "+a+" "+b);
		 

	}

}
