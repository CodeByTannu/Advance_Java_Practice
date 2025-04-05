package Practice;

import java.util.*;
public class StackExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s=new Stack();
		s.add(10);
		s.push(20);   //inser the elementt
		s.add(30);
		s.add(40);
		
		System.out.println(s);
		//s.remove(s.indexOf(30)) // we will not use remove 
		s.pop();  // delete the element
		
		
		
		System.out.println(s.search(20));
		System.out.println(s.peek());
		while(!s.empty())
		{
			s.pop();
		}
		
		System.out.println(s);
		System.out.println(s.empty());  // it is check stack is empty or not
		
		
		
	}

}
