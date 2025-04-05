package Practice;

import java.util.*;

public class QueueExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Queue<Integer> tq = new PriorityQueue<Integer>();   // queue is a interface it is provide priority or order 

		tq.add(23);
		//tq.add("xyzjfjjfj");    // it is remove captial word
		tq.offer(98);
		tq.add(2);
		tq.add(1);         //it is remove the smallest number */
		
		
		
		Queue<Integer> tq = new LinkedList<Integer>();    // order should be maintain
		tq.add(19);
		tq.add(4);
		tq.add(1);
		tq.add(0);
		tq.offer(120);
		
		//System.out.println(tq.element());
		System.out.println(tq.poll());
		
		System.out.println(tq);
		tq.remove();
		System.out.println(tq);
		
		
		
		/*System.out.println(tq.peek());   // provide null
		System.out.println(tq.element());*/  //provide error
		
}
}