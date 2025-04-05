package Practice;

import java.util.Scanner;

public class ExceptionFundamental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		try {
		System.out.println("Enter First Number :");
		int num1=s.nextInt();
		
		System.out.println("Enter Second Number :");
		int num2=s.nextInt();
		
		int n=num1/num2;
		System.out.println("Result is " +n);
		}
		catch(ArithmeticException e) {
			//System.out.println(e.getMessage());
			 System.out.println(e.toString());
		}
         // e.printStackTrace();
         
		//System.out.println("this code works fine");
		finally {                                                //for clossing the resources
			System.out.println("Finally executes ");
			}
	}

}
