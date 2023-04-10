package com.Inheritance;

	class Vehical1{
		Vehical1()
		{
			System.out.println("Vehical.......");
		}
	}

	class Truck extends Vehical1{
		Truck()
		{
			super();
			System.out.println("Vehical is Truck.......");
		}
	}


	public class SuperDemo1 {

		public static void main(String[] args) {
			Truck t=new Truck();
			

		}

	}



