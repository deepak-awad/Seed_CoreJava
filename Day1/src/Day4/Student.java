package Day4;

public class Student {
	
	private int d, m , y;
	private Account date;
	
	public Student()
	{
		d=15;
		m=02;
		y=2069;
		date= new Account();
	}
	public Student(int ddd, int mmm, int yyy, Account a)
	{
		this.d=ddd;
		this.m=mmm;
		this.y = yyy;
		this.date = a;
	}
	public String toString()
	{
		return "dd :"+d+" mm "+m+"yy"+y +"Date:"+date;
	}
	

}
