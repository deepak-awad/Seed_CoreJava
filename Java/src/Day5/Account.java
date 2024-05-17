package Day5;

public class Account {
	
	protected int accNo;
	protected String name;
	
	public Account()
	{
		accNo=12345;
		name="Deepak Awad";
	}
	public Account(int acc, String nm)
	{
		this.accNo = acc;
		this.name = nm;
	}
	/**public String toString()
	{
		return "Account no: "+accNo+" Name is: "+name;
	}*/
	
	public String print()
	{
		return "Account no: "+accNo+" Name is: "+ name;
	}
	

}
