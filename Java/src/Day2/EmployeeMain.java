package Day2;

public class EmployeeMain {
	
	public static void main(String args[])
	{
		Employee e = new Employee();
		e.gross_Salary();
		e.net_Salary();
		e.print();
		
		Employee e1= new Employee(102,"ok",1000,1500);
		e1.print();
		
		
	}

}
