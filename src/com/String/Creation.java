package com.String;

public class Creation {
	public static void main(String[] args) 
	{
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		String s4=new String("Hello");
		System.out.println(s1+" "+s2);
		
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		System.out.println(s3.hashCode()+" "+s4.hashCode());
		System.out.println(s3==s4);
		
		String st="Aa";
		String st1="BB";
		System.out.println(st+" "+st1);
		System.out.println(st==st1);
		System.out.println(st.hashCode()+" "+st1.hashCode());
		

	}


}
