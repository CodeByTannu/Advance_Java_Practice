package Practice;

import java.util.Scanner;

public class Ternary
{
	public static void main(String[] args)
	{
		// Create a Scanner object for input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");       // Input first number
		int num1 = sc.nextInt();

		System.out.println("Enter the Second number : ");           // Input Second number
		int num2 = sc.nextInt();
		
		// Using ternary operator to find the maximum of num1 and num2
		int max = (num1 > num2) ? num1 : num2;             
		System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max);   // Display the maximum number

		// Close the scanner
        sc.close();
	}
}
