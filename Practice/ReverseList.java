package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList 
{

	public static void main(String[] args) 
	{
		// Create a list of strings
		ArrayList<String> list =new ArrayList<String>();
		
		list.add("Tannu");
		list.add("Muskan");
		list.add("Anit");
		
		 // Print the original list
		System.out.println("Original List : "+list);
		
		// Use Collections.reverse() to reverse the list
           Collections.reverse(list);
		
		// Print the reversed list
		System.out.println("Reverse List :"+list);

	}

}
