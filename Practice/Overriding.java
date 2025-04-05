package Practice;

public class Overriding {

	public static void main(String[] args) {
		Human obj = new Child();              // it is upcasting always return right part
		obj.eat();
		
	}
	
	
}
class Human{
public void eat(){
		 System.out.println("Human is Eating");
	 }
}
class Boy extends Human
{
	public void eat() {
		 System.out.println("boy is Eating");
		
	}
	
}
class Child extends Boy
{
	public void eat() {
		 System.out.println("Child is Eating");
		
	}
}

