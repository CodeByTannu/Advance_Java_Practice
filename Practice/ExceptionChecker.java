package Practice;

public class ExceptionChecker
{
	public static void main(String[] args)
	    {
	        // Declare and initialize an array of size 5
	        int[] array = new int[5];

	        // Try to access an index that is out of bounds
	        try
	        {
	            // This will throw an ArrayIndexOutOfBoundsException because the array size is 5 and the maximum valid index is 4 (0-4)
	            System.out.println("Accessing array element at index : " + array[7]);
	        } catch (ArrayIndexOutOfBoundsException e)
	        {
	            // Catch the ArrayIndexOutOfBoundsException
	            System.out.println(e);
	            System.out.println(" ***The index you entered is out of bounds. ***");
	    	
	        }
	    	
	    }
	}

