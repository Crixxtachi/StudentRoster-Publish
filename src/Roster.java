import java.util.ArrayList;

public class Roster {

	static ArrayList<Student> students;
	
	public static void main(String... args) {
		students = new ArrayList<>();
		String [] students = 
                    {"1,John,Smith,John1989@gmail.com,20,88,79,59", 
	             "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
	             "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
	             "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
	             "5,Chike,O'Neil,coneil@wgu.edu,23,90,91,92"};
		toArray(students);
		
		print_all();
		print_invalid_emails();
		print_average_grade("3");
		remove("3");
		remove("3");

	}
	public static void add(String studentID, String firstname, String lastname, String emailaddress, int age, int grade1, int grade2, int grade3) {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(grade1);
		grades.add(grade2);
		grades.add(grade3);
		students.add(new Student(studentID, firstname, lastname, emailaddress, age, grades));
	}
	public static void remove(String studentID) {
		Student student = null;
		for (Student s : students) {
			if (s.getStudentID().equals(studentID)) {
				student =s;
				students.remove(student);
				break;
			}				
		}
		if (student == null)
			System.out.println("ERROR: student with this ID was not found.");
	}
	public static void print_all() {
		for (Student student : students)
			student.print();
	}
	public static void print_average_grade(String studentID) {
		Student student = null;
		for (Student s : students) {
			if (s.getStudentID().equals(studentID)) {
				student =s;
				break;
			}
		}
		if (student != null) {
			int score =0;
			for (int i: student.getGrades()) {
				score+=i;
			}
			int average = score/student.getGrades().size();
		    System.out.println("Average Score For StudentID: " + studentID + " = " + average);
		}
	}
	public static void print_invalid_emails() {
		for (Student student : students) {
			if (!student.getEmail().contains("@") || !student.getEmail().contains(".") || student.getEmail().contains(" "))
				System.out.println(student.getEmail());
		}
	}
	public static void toArray(String[] values) {
		for (String s : values) {
			String[] split = s.split(",");
			ArrayList<Integer> grades = new ArrayList<>();
			for (int i=5;i<split.length; i++)
				grades.add(Integer.valueOf(split[i]));
			Student student = new Student(split[0], split[1], split[2], split[3], Integer.valueOf(split[4]), grades);
			students.add(student);
		}
	}
}