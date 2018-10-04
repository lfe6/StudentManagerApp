package ie.gmit.studentmanager;

public class StudentManager {

	
	private static final int INITIAL_CAPACITY = 10;
	//create an array to hold the student objects
	
	private Student[] students=null;
	
	//private int[] studentAges;
	//constructor- instantiate student array
	
	public StudentManager() {
	students = new Student[INITIAL_CAPACITY];
		}
	//create methods you may need stub them out.
	
	public boolean add(Student student) {
		return false;
			}
	
	 public boolean delete(String studentId) {
		 return false;
	 }
	 
	 public Student[] getStudentsByFirstName(String firstName) {
	 return null;
	 }
	 
	 public int findTotalStudents() {
		 return -1;
	 }
	 
}
