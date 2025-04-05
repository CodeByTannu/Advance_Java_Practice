package Practice;

//Import the ArrayList class
import java.util.ArrayList;

public class SumEvenNumber
{
	
	public static void main(String[] args)
	{
		// Create an ArrayList of integers
		ArrayList<Integer> list1 =new ArrayList<Integer>();
		
		// Add some integers to the list
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		
		 // Initialize a variable to store the sum of even numbers
		int evensum=0;
		
		// Iterate over the ArrayList using a for-each loop
		for(int number:list1)
		{
			// Check if the number is divisible by 2
			if(number%2==0)
			{
				// Add the even number to the sum
				evensum+=number;
				
			}
		}
		
		// Print the sum of even numbers
		System.out.println("Sum of Even Number : "+evensum);
		
		
	}
	

}
