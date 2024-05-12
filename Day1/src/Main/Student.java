package Main;

public class Student {
	
	protected int rollno, marks;
	protected String name;
	
	public void initialize()
	{
		rollno=1;
		marks=10;
		name="Deepak Awad";
	}
	public void display()
	{
		System.out.println("Roll No: "+rollno+" Name: "+name+" Marks: "+marks);
	}
	
	public static void main(String args[])
	{
		Student s = new Student();
		s.initialize();
		s.display();
	}
	

}
