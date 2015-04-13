package prototype;

import java.util.List;

//Prototype design pattern is useful when instantiating another instance of a certain class is heavy.
//The idea behind it is to clone an existing object into a new one and avoid the heavy workload that comes with class instantiation.

public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Students students = new Students();
		students.loadData();
		
		Students students_1 = (Students) students.clone();
		Students students_2 = (Students) students.clone();
		
		List list_1 = students_1.getStuList();
		List list_2 = students_2.getStuList();
		
		System.out.println("student_1 list: " + list_1);
		System.out.println("student_2 list: " + list_2);
	}

}
