package com.Array;

public class VarArgDemo {
	public static void show(int ...a)
	{
		System.out.println("-----------------------------");
		for(int my:a)
		{
			System.out.println(my);
		}
	}

	public static void main(String[] args) 
	{
		show(10);
		show(34,56,67);
		show(90,63);

	}

}
