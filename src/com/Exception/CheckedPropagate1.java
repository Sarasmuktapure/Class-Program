package com.Exception;

import java.io.IOException;

public class CheckedPropagate1 {

	static void m1() throws IOException{
		throw new IOException("device error");
	}
	static void n1() throws IOException{
		m1();
	}
	static void p1() throws IOException{
		n1();
	}
	

	public static void main(String[] args) 
	{
		try
		{
			p1();
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
		

}
