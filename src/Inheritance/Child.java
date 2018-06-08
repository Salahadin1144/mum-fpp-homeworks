package Inheritance;

public class Child extends Parent implements CommonFunctions{
	public static void main(String args[]) {
		Child c = new Child();
		c.display();
		c.print();
		
	}
	
	void print(){
		CommonFunctions.super.display();
	}
}
