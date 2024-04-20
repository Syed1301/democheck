package BasicProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmpDetails implements Comparator<EmpDetails> {
	 
	int rollnum;
	String Name;
	int Age;	
	
	
  public int getRollnum() {
		return rollnum;
	}


	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


public EmpDetails(int rollnum, String name, int age) {
		this.rollnum = rollnum;
		this.Name = name;
		this.Age = age;
	}



public static void main(String[] args) {
	ArrayList <EmpDetails> al = new ArrayList<EmpDetails>();
	al.add(new EmpDetails(13,"Ravi",30));
	al.add(new EmpDetails(45,"Joel",27));
	al.add(new EmpDetails(1,"Ajay",28));
	
	System.out.println("Sorting  Age");
	
	Collections.sort(al,new Age());
	
	for(EmpDetails ep : al) {
		System.out.println(ep.Age+" "+ep.Name+" "+ep.rollnum);
	}
	
	
	System.out.println("Sorting  Name");
	
	Collections.sort(al,new Name());
	
	for(EmpDetails ep : al) {
		System.out.println(ep.Age+" "+ep.Name+" "+ep.rollnum);
	}
}
@Override
public int compare(EmpDetails o1, EmpDetails o2) {
	if(o1.getAge()==o2.getAge()) {
		return 0;
	}
	else if (o1.getAge()>o2.getAge()) {
		return 1;
	}else
	return -1;

}







}
