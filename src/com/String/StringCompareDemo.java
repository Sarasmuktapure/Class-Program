package com.String;

public class StringCompareDemo {
	public static void compareByEquals(String s1,String s2)
	{
		boolean isSame=s1.equals(s2);// compare both the string here letters should be same means capital to capital and small to small 
		System.out.println(isSame);
		System.out.println(s1.equalsIgnoreCase(s2));//here compare both content if same whether it is in capital or small doesn't matter
	}
	
	public static void compareByCompareTo(String s1,String s2)
	{
		int i=s1.compareTo(s2);//return the int value compare ASCII values and return remaining ASCII value
		System.out.println(i);//if return 0 then both string are same, if +ve value means s1 is greater than s2,  
	    // if -ve value means s2 is greater than s1
	
	}
	

	public static void main(String[] args) 
	{
		String s1="Hello";
		String s2="HEllo";
		StringCompareDemo.compareByEquals(s1, s2);
		StringCompareDemo.compareByCompareTo(s1, s2);
		
	}


}
