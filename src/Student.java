import java.util.ArrayList;

public class Student {

	private String studentID;
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private ArrayList<Integer> grades;
	
	public Student(String studentId,String firstName,String lastName,String email,int age,ArrayList<Integer> grades) {
		setAge(age);
		setEmail(email);
		setFirstName(firstName);
		setGrades(grades);
		setLastName(lastName);
		setStudentID(studentId);
	}
	public void print() {
		String g = "{";
		for (int i : grades)
			g+=i+", ";
		g.trim();
		g = g.substring(0, g.length()-2);
		g+="}";
		System.out.println(getStudentID() + "\t First Name: " + getFirstName() + "\t Last Name: " +getLastName() 
		+ "\t Age: " + getAge() + "\t Grades: " + g);
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<Integer> getGrades() {
		return grades;
	}
	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}	
}