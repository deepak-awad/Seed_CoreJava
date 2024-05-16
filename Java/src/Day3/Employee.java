package Day3;

public class Employee {
	
	private  String name;
	private float salary;
	private int empid;
	static private int val;
	
	static
	{
		val = 1;
	}
	
	public Employee(String na, float sal)
	{
		this.name=na;
		this.salary = sal;
		empid= val++;
	}
	
	//public static void getString()
	//{
	    //empid = val++;
	//}
	
	public void getDemo()
	{
		System.out.println("Employee id:"+empid+"Name is"+name+"Salary is:"+salary);
	}
}
