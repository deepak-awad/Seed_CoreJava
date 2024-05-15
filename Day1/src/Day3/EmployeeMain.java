package Day3;

public class EmployeeMain {
	
	public static void main(String args[])
	{
		Employee e = new Employee("New York",3000f);
		Employee e1 = new Employee("London",4000f);
		Employee e2 = new Employee("New ",5000f);
		e.getDemo();
		e1.getDemo();
		e2.getDemo();
	}

}
