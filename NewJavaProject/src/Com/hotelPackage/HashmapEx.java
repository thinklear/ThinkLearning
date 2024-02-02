package Com.hotelPackage;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		//HashMap <Integer,String> hm=new HashMap <Integer,String>();
		map.put(101, "Gokul1");
		//hm.put(100, "Gokul2");
		map.put(102, "Gokul3");
		map.put(103, "Gokul4");
		System.out.println(map);
		map.remove(102);
		System.out.println(map);
		map.put(1005, "Last");
		System.out.println(map);
		
		System.out.println(map.get(104));
		//reeding pairs using for loop 
		for (Map.Entry m:map.entrySet()) {
			System.out.println(m);
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			
		}
		System.out.println(map.get(101));
		

	}

}
