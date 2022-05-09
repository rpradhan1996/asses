package asse1;

public class Student {
	int id;
	String studname;
	String address;
	StudentMarks marks;
	
	public Student() {}

	public Student(int id, String studname, String address, StudentMarks marks) 
	{
		this.id = id;
		this.studname = studname;
		this.address = address;
		this.marks = marks;
	}

	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}

	public String getStudname() 
	{
		return studname;
	}
	public void setStudname(String studname) 
	{
		this.studname = studname;
	}

	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}

	public StudentMarks getMarks() 
	{
		return marks;
	}
	public void setMarks(StudentMarks marks)
	{
		this.marks = marks;
	}


	public String toString() 
	{
		return "Student id is :- " + id + ", Student Name Is :- " + studname + ", Student Address is :- " + address + ", Marks :- " + marks;
	}	
}


