package Practice;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // create a Scanner object to read input from the user
		System.out.println("Enter a Number :"); // prompt the user to enter a number

		int num = sc.nextInt(); // Read the integer input from the user

		if (num % 2 == 0) { // Check if the number is even or odd

			System.out.println(num + " is an Even Number"); // If the number is divisible by 2(reminder is 0),it is even
															// number

		} else {
			System.out.println(num + " is an Odd Number"); //// If the number is not divisible by 2(reminder is not
															//// 0),it is even number
		}

	}

}
