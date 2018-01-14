package Admin;

import java.io.Console;
import java.util.ArrayList;

public class ManageSystem {
	
	//To store student objects
	private ArrayList container = new ArrayList();
	
	public ManageSystem() {
		
	}
	
	//此方法可以添加学生对象
	public void add (Student s) {
		container.add(s);
	}
	
	//List all objects of students
	public void list() {
		for(int i=0; i<container.size(); i++) {
		Student s =	(Student)container.get(i);
		System.out.println("Student:" + s.getName() + " ID: " + s.getId());
		}
	}
	
	//To find a student by name
	public Student find(String name) {
		for(int i=0; i<container.size(); i++) {
			Student s =	(Student)container.get(i);
			if (name.equals(s.getName())) {
				return s;
			}			
		}
		return null;
	}
	
	//To delete a student by id
	public void remove (String id) {
		
	}

}
