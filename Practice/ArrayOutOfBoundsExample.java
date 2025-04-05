package Practice;

public class ArrayOutOfBoundsExample
{
	
	    public static void main(String[] args)
	    {
	        // Create an array with 5 elements
	        int[] numbers = {10, 20, 30, 40, 50,60,80};
	        
	        // Loop through the array and try to access an element beyond the last index
	        for (int i = 0; i <= numbers.length; i++)
	        {
	            try
	            {
	                // Attempt to access the array at index 'i'
	                System.out.println("Element at index " + i + ": " + numbers[i]);
	            } catch (ArrayIndexOutOfBoundsException e)
	            {
	                // Catch the ArrayIndexOutOfBoundsException and print a message
	                System.out.println("Caught ArrayIndexOutOfBoundsException: Index " + i + " is out of bounds.");
	            }
	        }
	    }
	}

