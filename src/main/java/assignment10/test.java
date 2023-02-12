package assignment10;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
	    students.add(new Student("John", 80, 70, 90));
	    students.add(new Student("Jane", 90, 60, 85));
	    students.add(new Student("Jim", 85, 75, 80));

	    for (Student student : students) {
	      student.showResult();
	    }
	}
}
