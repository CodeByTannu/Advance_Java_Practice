package Practice;

public class Polymorphism
{
	
	public static void main(String[] args) 
	{
		PolymorphismBL pb1 =new PolymorphismBL();
		pb1.n1(76);
		pb1.n1(4564534459l);    // in long after the number write l
		pb1.n1(76,"a");
		pb1.n2(1,2,3,4,5);
		
		
		
	}
	
}
 class PolymorphismBL{
	
	public void n1()      // no. of parameter
	{
		System.out.println(10);
		
	}
	public void n1(int x)    
	{
		System.out.println(20);
	}
	public void n1(long x)    // type of parameter
	{
		System.out.println(30);
	}
	public void n1(int x,String y)    //order of parameter
	{
		System.out.println(40);
	}
	public void n1(String y,int x)
	{
		System.out.println(50);
	}
	public void n2(int ...a)
	{
		System.out.println(a);
	    for(var i:a) {
	    	System.out.println(i);
	    }
	}
	
}
 
 class Calculator
 {
	 public void add(int x,int y) {
		 System.out.println(x+y);
	 }
	 
	 public void add(float x,float y) {
		 System.out.println(x+y);
	 }
	 public void add(String x,String y) {
		 System.out.println(x+y);
	 }
 }
 
 
 