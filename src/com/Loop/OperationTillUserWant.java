package com.Loop;

import java.util.Scanner;

public class OperationTillUserWant {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		char ch;
		
		
		do {
			System.out.println(" 1.Addition\n 2.Multiplication\n 3.Substraction\n 4.Division");
			System.out.println("Enter your choice from above menu....");
			int choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:System.out.println("Addition is="+(num1+num2));
			break;
			
			case 2:System.out.println("Multiplication is="+(num1*num2));
			break;
			
			case 3:System.out.println("Substraction is="+(num1-num2));
			break;
			
			case 4:System.out.println("Division is="+(num1/num2));
			break;
			
			default:System.out.println("Invalid choice");
			
			}
			
			System.out.println("Do you want to continue.....?");
			ch=sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		
		
		
		

	}
	

}
