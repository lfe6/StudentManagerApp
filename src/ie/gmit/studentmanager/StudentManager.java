package ie.gmit.studentmanager;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

	List<Student> students;

	//constructer
	public StudentManager() {

	students = new ArrayList<Student>();
	}
	
	//create methods you may need stub them out.
	
	public boolean add(Student student) {
		try {
		return students.add(student);
		}catch (Exception error) {
	error.printStackTrace();
	return false;
		}
		}
	
	 public boolean delete(String studentId) {
		 //search for the student by ID
		 Student student = getStudentById(studentId);
		 //if a student was found then delete the student
		 if (student !=null) {
			 return students.remove(student);
		 }else {
			 //if no student was foung return false
		 return false;
		 }
	 }
	 
	 public Student getStudentById(String studentId) {
		 //loop over arraylist
		 for(Student student : students) {
			 if(student.getStudentId().equals(studentId)) {
				 return student;
			 }
			 
		 }
	 return null;
	 }
	 
	 public int findTotalStudents() {
		 return -1;
	 }
	 
}
