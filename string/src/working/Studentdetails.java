package working;

public class Studentdetails{

	private int id;
	private String name;
	private String gender;
	private int age ;
	private boolean isGood;
	
	
	


	@Override
	public String toString() {
		return "Studentdetails [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", isGood="
				+ isGood + "]";
	}


	public Studentdetails(int id, String name, String gender, int age, boolean isGood) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.isGood = isGood;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGood() {
		return isGood;
	}
	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
	
	

}
