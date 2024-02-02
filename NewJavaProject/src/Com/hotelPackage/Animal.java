package Com.hotelPackage;

public class Animal {
	String colour="White";//instance variable // immediate parent class instance 
	 void eating () {
		System.out.println("Eating");
	}
	
}
class Dog extends Animal{
	String colour="Black";
	
	void displayColour() {
		System.out.println(colour);
		System.out.println(super.colour);
	}
		void eating () {
			System.out.println("eating bread");
			super.eating();
		}
	}
	
	


