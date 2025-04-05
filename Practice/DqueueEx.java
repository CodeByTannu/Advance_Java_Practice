package Practice;
import  java.util.*;
public class DqueueEx
{
	public static void main(String[] args)
	{
		
		Deque<String> dq = new ArrayDeque<String>();
		
		dq.add("tarun");
		dq.addLast("Aanchal");
		dq.add("Bhawana");
		dq.addFirst("Farhan");
		dq.addFirst("Kunal");
		dq.add("Farhan");
		
		
		System.out.println(dq);
		dq.remove();
		System.out.println(dq);
		
		
	}

}
