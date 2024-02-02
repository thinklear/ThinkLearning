package Com.hotelPackage;

public class PracticeClass {
	int sID;
	String name;
	char grade;
	
	PracticeClass(int id, String n, char g){
		sID=id;
		name=n;
		grade=g;
		
	}
	void display() {
		System.out.println(sID+""+ name+""+grade);
	}
	public static void main (String [] args) {
		PracticeClass obj=new PracticeClass(10,"gokul", 'G');
		obj.display();
		
	}

}
