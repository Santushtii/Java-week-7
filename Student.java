package studentManagementSystem;

public class Student {
	String name;
	int age;
	
	Student(String name, int age){
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
		Student s= new Student("Suresh", 19);
		System.out.println("Name of Student: "+s.name);
		System.out.println("Age of Student: "+s.age);
		
	}

}
