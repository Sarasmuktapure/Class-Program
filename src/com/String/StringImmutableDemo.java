package com.String;

public class StringImmutableDemo {
	public static void main(String[] args)
	{
		String str="Hello";
		String str2="Hello";
		System.out.println(str+" "+str2);
		System.out.println(str==str2);
		System.out.println(str.hashCode()+" "+str2.hashCode());
		System.out.println(str+" "+str2);
		System.out.println(str==str2);
		System.out.println(str.hashCode()+" "+str2.hashCode());
		String st=new String("Hello");
		System.out.println(st==str2);
		
		

	}


}
