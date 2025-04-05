package Practice;

//importing Scanner class from java.util package
import java.util.Scanner;

public class StrongNumber 
{
	// Method to calculate factorial of a number
	static int factorial(int n)
	{
	if(n == 0||n==1)
	{
		return 1;
	}
		else
		{
	        return n * factorial(n - 1);
		}
		
	}
	 // Method to check if a number is a Strong number
    static boolean isStrongNumber(int num)
    {
        int originalNum = num;
        int sum = 0;

     // Calculate sum of factorial of digits
        while (num > 0)
        {
            int digit = num % 10;               // Extract the last digit
            sum += factorial(digit);            // Add factorial of digit to sum
            num /= 10;
        }
       
        // Check if sum of factorial equals the original number
        return sum == originalNum;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to check : ");
        int num = sc.nextInt();                                          //Read input number
        
        // Check if number is a Strong number and print result
        if (isStrongNumber(num))
        {
            System.out.println(num + " is a Strong number.");
        } else
        {
            System.out.println(num + " is not a Strong number.");
        }
       
        // Close the Scanner object
        sc.close();    
    }
}
	


