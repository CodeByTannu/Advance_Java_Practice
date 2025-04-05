package Practice;

import java.util.*;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> llist =new LinkedList<String>();
		
		ArrayList<String> arraylist =new ArrayList<String>();
		
		arraylist.add("String1");
		arraylist.add("String2");
		arraylist.add("String3");
		System.out.println(arraylist);
		
	     llist.add("tannu");
	     llist.add("name is");
	     llist.add("mine");
	     llist.remove();
	     llist.addLast("........");
		
		
		System.out.println("LinkedList :"+llist);
		
		LinkedList <Integer> l1 =new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		//l1.remove(1);
		l1.remove(Integer.valueOf(30));     //The constructor Integer(int) has been deprecated
		//l1.remove(l1.indexOf(30));
		
		System.out.println(l1);
	}

}
