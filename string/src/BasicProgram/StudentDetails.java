package BasicProgram;

public class StudentDetails {
	protected  String StudentName;
	protected  int Age;
	protected  String Address;
	protected  String StudentOtherDetails;
	
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getAge() {
		return Age;
	}
	public int setAge(int age) {
		return Age = age;
	}
	public String getAddress() {
		return Address;
	}
	public String setAddress(String address) {
		return Address = address;
	}
	public String getStudentOtherDetails() {
		return StudentOtherDetails;
	}
	public String setStudentOtherDetails(String studentOtherDetails) {
		return StudentOtherDetails = studentOtherDetails;
	}
	public StudentDetails(String studentName, int age, String address, String studentOtherDetails) {
		
		StudentName = studentName;
		Age = age;
		Address = address;
		StudentOtherDetails = studentOtherDetails;
	}
	

}
