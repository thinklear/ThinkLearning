package Com.hotelPackage;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list.add("gokul");
		list.add("Ram");
		list.add("Shyam");
		list.add("Nam");
		list1.add(100);
		System.out.println(list.size());
		list.remove(3);
		System.out.println(list.size());
		
		System.out.println(list);
		System.out.println(list.size());
		for (String s:list) {
			System.out.println(s);
		}
		
		for (Integer s:list1) {
			System.out.println(s);
		}
		
	}

}
