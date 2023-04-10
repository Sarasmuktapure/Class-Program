package com.Inheritance;
class Chocalate{
	String shape="Rectangle";
	int price=20;
}

class Kitkat extends Chocalate{
	void changePrice() {
		price=60;
	}
	void showKitkat() {
		System.out.println(shape+" "+price);
	}
}

class Cadbury extends Chocalate{
	void changeShape()
	{
		shape="Square";
	}
	void showChocalate() {
		System.out.println(price+" "+shape);
	}
}


public class HirachicalDemo {
	public static void main(String[] args) {
		Kitkat k= new Kitkat();
		k.changePrice();
		k.showKitkat();
		
		Cadbury c=new Cadbury();
		c.changeShape();
		c.showChocalate();

	}

}
