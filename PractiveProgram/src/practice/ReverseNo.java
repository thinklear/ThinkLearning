package practice;

public class ReverseNo {

	public static void main(String[] args) {
		
		int no=474877478;
		int ReverseNo=0;
	while (no!=0) {
		int remainder=no%10;
		ReverseNo=ReverseNo*10+remainder;
		
		no=no/10;
	}
	System.out.println(ReverseNo);
	}

};
