package ie.gmit.studentmanager;

public class Student {

	private String firstname;
	private String studentId;
	private String surname;
	private Address address;
	private Course course;
	private byte age;

	// constructor
	public Student(String sid) {
		this.studentId = sid;
	}

	public Student(String studentId, Course course, String surname, String firstname, Address address, byte age) {
		this.firstname = firstname;
		this.age = age;
		this.surname = surname;
		this.address = address;
		this.course = course;
		this.studentId = studentId;

	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
