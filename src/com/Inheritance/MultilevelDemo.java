package com.Inheritance;


	class Mobile{
		int price=10000;
	}


	class Apple extends Mobile{
		String camera="13px";
		void showPrice() {
			System.out.println(price);
		}
	}

	class Iphone extends Apple{
		void changePrice()
		{
			price=32000;
		}
		void showDetails() {
			System.out.println(price+" "+camera);
		}
	}

	public class MultilevelDemo {
	
		public static void main(String[] args)
		{
			Iphone p=new Iphone();
			p.showPrice();
			p.changePrice();
			p.showDetails();

		}

	}


