package Practice;

//Define a class that extends Thread
class PrintNumbers extends Thread
{
 
	@Override
 public void run()
 {
     // Print numbers from 0 to 4
     for (int i = 0; i <= 4; i++)
     {
         System.out.println(i);
         try
         {
             // Sleep for 1 second before printing the next number
             Thread.sleep(1000);
         } catch (InterruptedException e)
         {
             // Handle the exception and restore the interrupted status
             System.err.println("Thread was interrupted");
             Thread.currentThread().interrupt();
         }
     }
 }
}

public class PrimeNum{
 public static void main(String[] args)
 {
     // Create an instance of PrintNumbers
     PrintNumbers thread = new PrintNumbers();
     
     // Start the thread
     thread.start();
 }
}