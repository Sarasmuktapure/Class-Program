package com.Final;

public class FinalDemo1 {
	final int x;
	FinalDemo1()
	{
		x=20;
	}
	void dislpay()
	{
		System.out.println(x);
	}



	public static void main(String[] args) {
		FinalDemo1 d1=new FinalDemo1();
		System.out.println(d1.x);
		d1.dislpay();
	}

}
