package Practice;

import java.util.*;

public class ComparableIMPL {     // specify the comparable type

	public static void main(String[] args) {
		
		Person s1 =new Person(1,"Rajesh",10);
		Person s2 =new Person(2,"Rehan",20);
		Person s3 =new Person(3,"Amit",16);
		Person s4 =new Person(4,"Sumit",9);
		Person s5 =new Person(4,"piyush",34);
		Person s6 =new Person(5,"parveen",12);
		
		Set<Person> studentlist = new HashSet<>();       // treeset,hashset,linkedlist
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		studentlist.add(s5);
		studentlist.add(s6);
		
		System.out.println(studentlist);
		
		
	}
	

}
class Person implements Comparable<Person>
{
	int id;
	String name;
	int age;
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int toString(Person o) {
		return this.age-o.age ;
		
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
}
