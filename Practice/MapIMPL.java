package Practice;
import java.util.*;
import java.util.Map.Entry;

public class MapIMPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> empRecord = new HashMap<Integer,String>();
		empRecord.put(101, "Ramesh");
		empRecord.put(102, "Ganesh");
		empRecord.put(103, "Dinesh");
		empRecord.put(104, "Ramesh");            //key only one and we are passing value more in one key
		
		System.out.println(empRecord);
		empRecord.remove(104);
		System.out.println(empRecord);
		System.out.println(empRecord.get(101));   // when the key is not available than return null
		
		
		
		
		System.out.println("Welcome" +empRecord.get(102));
		
		
		/*for(Entry<Integer,String> k: empRecord.entrySet())
		{
			System.out.println(k.getKey());   // one way
			System.out.println(k.getValue());
		}
		
		Set s =empRecord.entrySet();
		Iterator it= s.iterator();
		while(it.hasNext())
		{
                  Entry<Integer,String> e = (Entry<Integer,String>) it.next();
                  System.out.println(e.getKey());   // two way
      			System.out.println(e.getValue());
		}*/

	}

}
