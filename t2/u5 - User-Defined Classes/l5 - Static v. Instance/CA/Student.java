public class Student {
	private String firstName;
	private String lastName;
	private int gradeLevel;
	private double gpa;
	private static int counter;
	private int studentID;

	public Student() {
		this("None", "None", 0, 0.0);
	}

	public Student(String student_firstName, String student_lastName, int student_gradeLevel, double student_gpa) {
		firstName = student_firstName;
		lastName = student_lastName;
		if (student_gradeLevel >= 0 && student_gradeLevel <= 12) {
			gradeLevel = student_gradeLevel;
		} else {
			gradeLevel = 0;
		}
		if (student_gpa >= 0.0 && student_gpa <= 4.5) {
			gpa = student_gpa;
		} else {
			gpa = 0.0;
		}
		counter++;
		studentID = counter;
	}

	public String toString() {
		return lastName + ", " + firstName + "\nGPA: " + gpa + "\nGrade Level: " + gradeLevel + " id # " + studentID;
	}
}