package Com.hotelPackage;

public class StaticKeyword {
	 int empNo;
	 String empName;
	static  int deptNo=500;
	 public void empData(int empNo, String empName) {
		 this.empNo=empNo;
		 this.empName=empName;
		 
	 }
	 public  void someData(int empNo, String empName) {
		 
		 System.out.println(empNo+" "+ empName+" "+ deptNo);
	 }
	public void displayMethod() {
		System.out.println(empNo+" "+empName+" "+deptNo);
	}
	public static void main (String [] args) {
		StaticKeyword obj=new StaticKeyword();
		
		obj.empData(10, "gokul");
		obj.displayMethod();
		obj.someData(100, "gokul1");
	}

}
