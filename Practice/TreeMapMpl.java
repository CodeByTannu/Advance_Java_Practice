package Practice;

import java.util.*;

public class TreeMapMpl {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> empRecord = new TreeMap<>();
		empRecord.put(110, "Ramesh");
		empRecord.put(102, "Ganesh");
		empRecord.put(103, "Dinesh");
		empRecord.put(104, "Ramesh");
		empRecord.put(105, "null");
		
		System.out.println(empRecord);
		
		/*System.out.println("welcome"+ empRecord.get(102));
		//System.out.println(empRecord.lastkey());
		System.out.println(empRecord);
		System.out.println(empRecord.keySet());
		System.out.println(empRecord.values());
		
		
		//for(Entry<Integer,String> emp : empRecord.entrySet())
		for(var emp : empRecord.entrySet())          //var is used for dynamic as a parameter are not allowed
		{
			System.out.println(emp.getKey());
			System.out.println(emp.getValue());
			}*/
		
			
			
		System.out.println(empRecord.firstKey());
		System.out.println(empRecord.higherKey(102));
		
	System.err.println(empRecord.floorKey(105));
	}

}
