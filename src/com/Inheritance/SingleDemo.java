package com.Inheritance;

class Laptop{
	String memory="8GB";
	void showScreen() {
		System.out.println("Laptop showing with good quality....");
	}
}
class Dell extends Laptop{
	public void show()
	{
		System.out.println(memory);
	}
}
public class SingleDemo {
	

	public static void main(String[] args) {
		Dell d= new Dell();
		d.show();
		d.showScreen();

	}

}
