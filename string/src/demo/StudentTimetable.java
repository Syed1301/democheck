package demo;

public class StudentTimetable {
	   int StudentClassTime;
	   int StudentSchool;
	   
	   
	public int getStudentClassTime() {
		return StudentClassTime;
	}
	public void setStudentClassTime(int studentClassTime) {
		StudentClassTime = studentClassTime;
	}
	public int getStudentSchool() {
		return StudentSchool;
	}
	public void setStudentSchool(int studentSchool) {
		StudentSchool = studentSchool;
	}
	public StudentTimetable(int studentClassTime, int studentSchool) {
		
		StudentClassTime = studentClassTime;
		StudentSchool = studentSchool;
	}
	   
	   

}
