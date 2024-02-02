package testProgram;

import java.util.ArrayList;
import java.util.Scanner;

class HotelM{
	static Scanner sc=new Scanner (System.in);
	void greetings() {
		System.out.println("Welcome Sir/Madam");
		System.out.println("Please Enter your name ");
	}
	void customerInfo (){
		
		String name=sc.nextLine();
		System.out.println("Name of the customer:"+name);
		if (!name.isEmpty()) {
			System.out.println("Please select the Below option");
			int options =sc.nextInt();
			switch (options)
			{
			case 1: System.out.println("Dining");
					break;
			case 2: System.out.println("Room Booking");
					break;
			default : System.out.println("Select valid option");		
			}
		}else {
			System.out.println("Please Enter the name");
		}
	}
		
		void dining() {
			System.out.println("Please select the Table Number from below option");
			ArrayList<Integer> tableNumber=new ArrayList<>();
			
			tableNumber.add(1);
			tableNumber.add(2);
			tableNumber.add(3);
			tableNumber.add(4);
			tableNumber.add(5);
			for (Integer tableNumbers:tableNumber) {
				System.out.println(tableNumbers);
				int table=sc.nextInt();
				if(tableNumber.contains(table)) {
					System.out.println("you have been alloted table number "+ table);
					tableNumber.remove(table);
				}
				else {
					System.out.println("sorry the table number"+ table+ " is not available");
				}
			}
				
			}
		}
		

public class HotelMain {

	public static void main(String[] args) {
		HotelM HotelG=new HotelM();
		HotelG.greetings();
		HotelG.customerInfo();
		HotelG.dining();

	}

}
