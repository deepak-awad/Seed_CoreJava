package Day2;

public class Employee {
	
	private int Employee_Id;
	private String Employee_Name;
	private double Basic_Salary, HRA, Medical, PF, PT, Net_Salary, Gross_Salary;
	
	public Employee()
	{
		Employee_Id=101;
		Employee_Name="Deep";
		Basic_Salary=15000;
		Medical=200;
		HRA=(Basic_Salary*50/100);
		PF = (Basic_Salary*12/100);
		PT= 200;

	}
	
	public void gross_Salary()
	{
		Gross_Salary=(Basic_Salary+HRA+Medical);
	}
	public void net_Salary()
	{
		Net_Salary= (Gross_Salary-(PT + PF));
	}
	
	public Employee(int id, String name,long salary,double medical)
	{
		this.Employee_Id = id;
		this.Employee_Name = name;
		this.Basic_Salary = salary;
		this.Medical = medical;
		gross_Salary();
		net_Salary();
	}

	public void print()
	{
		System.out.println("The Employee Id:"+Employee_Id);
		System.out.println("The Employee name:"+Employee_Name);
		System.out.println("The Basic Salary:"+Basic_Salary);
		
		System.out.println("The employee gross salary:"+Gross_Salary);
		System.out.println("The employee gross salary:"+Net_Salary);	
	}
}
