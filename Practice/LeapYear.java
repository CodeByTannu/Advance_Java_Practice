package Practice;


	import java.util.Scanner;

	public class LeapYear{
	    public static void main(String[] args)
	    {
	        // Create a Scanner object for taking input from the user
	        Scanner sc = new Scanner(System.in);

	        // Prompt the user to enter a year
	        System.out.print("Enter a year: ");
	        int year = sc.nextInt();

	        // Close the Scanner object to prevent resource leak
	        sc.close();

	        // Check if the year is a leap year
	        if (isLeapYear(year))
	        {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	    }

	    // Method to check if a given year is a leap year
	    public static boolean isLeapYear(int year)
	    {
	        // Leap year conditions:
	        // 1. Year is divisible by 4
	        // 2. Year is not divisible by 100, unless
	        // 3. Year is divisible by 400
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	        {
	            return true;
	        } else
	        {
	            return false;
	        }
	    }
	}

