package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramBoolean {
	public boolean checkAnagram(String s1,String s2)
	{
		String st1=s1.toLowerCase();
		String st2=s2.toLowerCase();
		boolean isAnagram=false;
		System.out.println(st1+" "+st2);
		
		char ch1[]=st1.toCharArray();
		char ch2[]=st2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		
		String str1=new String(ch1);
		String str2=new String(ch2);
		
		if(str1.compareTo(str2)==0)//(str1.equals(str2)
		{
			isAnagram=true;
		}
		return isAnagram;
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String s1=sc.next();
		System.out.println("Enter the 2nd string");
		String s2=sc.next();
		AnagramBoolean ab=new AnagramBoolean();
		boolean isCheck=ab.checkAnagram(s1, s2);
		if(isCheck)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
				
		
	}

}
