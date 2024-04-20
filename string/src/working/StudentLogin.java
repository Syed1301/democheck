package working;

public class StudentLogin {
	private String Studentid;
	private String StudentName;
	private String StudentPassword;
	
	public String getStudentid() {
		return Studentid;
	}
	public String setStudentid(String studentid) {
		return Studentid = studentid;
	}
	public String getStudentName() {
		return StudentName;
	}
	public String setStudentName(String studentName) {
		return StudentName = studentName;
	}
	public String getStudentPassword() {
		return StudentPassword;
	}
	public String setStudentPassword(String studentPassword) {
		return StudentPassword = studentPassword;
	}
	public StudentLogin(String studentid, String studentName, String studentPassword) {
		
		Studentid = studentid;
		StudentName = studentName;
		StudentPassword = studentPassword;
	}


}
