package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class CollectionBasics {
	public static void main(String [] args) {
		List a1 = new ArrayList();
		//List<Integer> a11 =new ArrayList<Integer>();
		
		//a11.add(10);
		//a11.add(20);
		//a11.add(30);
		//a1.add("abc");
		
		//a11.remove(a11.indexOf(1));
		//a11.remove(a11.lastIndexOf(1));
		List<String> listName=new ArrayList<String>();
		
		//al.add(10);
      listName.add("20");
	  listName.add("30");
		listName.add("abc"); //it is type safety
		System.out.println(listName);
		Collections.sort(listName);
		System.out.println(listName);
		
		
	
	List<Integer> numbers =new ArrayList<Integer>();
	     numbers.add(3);
	     numbers.add(4);
	     numbers.add(4);
	     numbers.add(6);
	     for(int i=0; i<numbers.size();i++)
	     {
	    	
			System.out.println(numbers.get(i));
	     }
   System.out.println("......................");
   for(int i:numbers)
   {
	   System.out.println(i);
   }
   System.out.println("...............");
   ListIterator it=numbers.listIterator();
   while(it.hasNext()) {
	   System.out.println(it.next());
   }
	}

   }	


class MyGen<T>
{
	public void add(T a, T b)
	{
		
	}
}
