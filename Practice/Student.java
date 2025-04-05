package Practice;

public class Student {
	private int id;
	private String name;
	public int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("name");
		System.out.println(s.getName());
	}

	public int id() {
		// TODO Auto-generated method stub
		return 0;
	}
}
