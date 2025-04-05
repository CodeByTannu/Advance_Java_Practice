package Practice;

public class A {
	
		public int y=10;
		
	}
	class B extends A{
		B()
		{
			this("abc");
		System.out.println("first constructor");
			}
		B(int a){
			this();
			System.out.println("Second constructor");
			
		}
		B(String x){
			System.out.println("third constructor");
			
		}
		public int x=30;
		public int y=22;
		
		public void display(int x)
		{
			System.out.println(this.x+super.y);
		}
		public static void main(String[] args) {
			B b=new B(5);
			b.display(100);
		}
		
	}


