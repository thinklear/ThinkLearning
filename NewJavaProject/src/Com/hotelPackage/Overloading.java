package Com.hotelPackage;


	class  Bank{
		
	double rateOfInterest() {
		return 0;
	}
	}
	class SBI extends Bank
	{
		double rateOfInterest() {
			
			return 9.8;
		}
	}
	class ICICI extends Bank
	{
		double rateOfInterest() {
		return 10.50;
			
		}
		
	}
	class Axis extends Bank {
		double rateOfInterest() {
			return 11.50;
		}
	}
	
	public class Overloading {
	public static void main(String[] args) {
		Axis axis=new Axis();
		SBI sbi=new SBI();
		
		System.out.println(axis.rateOfInterest());
		System.out.println(sbi.rateOfInterest());
		
	}

}
	
	
	
