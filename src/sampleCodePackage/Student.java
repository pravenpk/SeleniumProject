package sampleCodePackage;

public class Student {

	int rollNo;
	float CGPA;

	public Student(String name) {
		System.out.println("Student's name is:"+name);
	}
	
	public void setRollNumber(int roll) {
		rollNo = roll;
	}
	public void setCGPA(float studentCGPA) {
		CGPA = studentCGPA;
	}
	
	

}
