package pack;

import BasicProgram.StudentDetails;
import demo.StudentTimetable;
import working.StudentLogin;

public class Student {
	
	
   void StudentStudymeterial() {
	   String StudentSubject;
	   String StudentOtherthing;
   }
   
  
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentLogin obj = new StudentLogin("12345", "Syed", "23423");
		StudentDetails obj1 = new StudentDetails("syed", 19, "chennai", "other");
		StudentTimetable obj3 = new StudentTimetable(2, 4);
		
		System.out.println("Student id "+obj.getStudentid());
		System.out.println("Student Name "+obj.getStudentName());
		System.out.println("Student Password "+obj.getStudentPassword());
		
		System.out.println(obj3.getStudentClassTime());
	
		
		
		
		
		
	}

}
