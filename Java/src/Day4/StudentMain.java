package Day4;

public class StudentMain {
	
	public static void main(String args[])
	{
		Student s = new Student();
		System.out.println(s.toString());
		
		Student s1 = new Student(15,10,1998, new Account(102,"Hello", new MyDate(05,02,2019)));
		System.out.print(s1.toString());
		
	}

}
