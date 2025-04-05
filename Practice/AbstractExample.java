package Practice;

public class AbstractExample {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		//Shape s=r;
		r.n1();
		r.draw();
		
		
		
		
	}

}
 abstract class Shape
{
	public abstract void draw();
	public abstract void clear();
	
	
	public void n1() {
		System.out.println("Something is getting printed");
		
		
	}
	public Shape() {
		
	}
}
 class Rectangle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a rectangle");
	}
	 public void clear(int x) {
		                           // we are passing same parameter
	 }
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
 }
