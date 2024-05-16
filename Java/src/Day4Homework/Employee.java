package Day4Homework;

public class Employee
{
	
	private float bsalay;
	
	public Employee(float b)
	{
		this.bsalay = b;
		
	}
	public double calculate()
	{
		return bsalay * 1.02;
		
	}
	public String toString()
	{
		return "incremented salary:"+calculate();
	}
	
}

  class Manager extends Employee
  {
	  private float bonus;
	  
	  public Manager(float bs, float b)
	  {
		  super(bs);
		  this.bonus = b;
	  }
	  public double calculate1()
		{
			double salaryincr = super.calculate();
			return salaryincr + bonus;
			
		}
	  public String toString()
		{
			return super.toString()+" Bonus With incremented slary is:"+calculate1();
		}
	  
	  
	  
  }


