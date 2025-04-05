package Practice;

//Define a class that extends the Thread class
public class ThreadIMPL2 extends Thread 
{
 
 @Override
 public void run() 
 {
     // Loop from 1 to 10
     for (int i = 1; i <= 10; i++) 
     {
         // Print the current number
         System.out.println(i);
         
         try
         {
             // Sleep for 500ms 
             Thread.sleep(500);
         } catch (InterruptedException e)
         {
             // Catch and handle the InterruptedException that might be thrown
             e.printStackTrace();
         }
     }
 }

 // Main method to start the thread
 public static void main(String[] args) 
 {
     // Create an instance of the PrintNumbersWithDelay thread
     ThreadIMPL2 thread = new ThreadIMPL2();
     
     // Start the thread
     thread.start();
 }
}