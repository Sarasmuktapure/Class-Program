package com.String;

public class StringMethods {

	public static void main(String[] args) 
	{
		String s="I Like India";
		System.out.println(s.length());// gives number of character from the string
		
		System.out.println(s.substring(3));//gives from 3rd index to end
		
		System.out.println(s.substring(3, 8));//gives from 3rd index to 7th index
		
		System.out.println(s.subSequence(3, 8));// act same as s.substring(3,8)
		
		char ch=s.charAt(2);//gives character at 2nd index
		System.out.println(ch);
		
		int start=s.indexOf('e');//gives start index of e
		System.out.println(start);
		
		int end=s.lastIndexOf('i');//gives last index of i
		System.out.println(end);
		
		String s1="c,c++,java,python";
		String []str=s1.split(",");//gives each word in string by separating comma. here we can split depend on thing which we gives in bracket of split method 
		
		for(String sr:str)
		{
			System.out.println(sr);
			
		}
		
	}

}
