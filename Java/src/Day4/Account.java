package Day4;

public class Account {
	
	private int Acc_No;
	private String Name;
	private MyDate obj;
	
	public Account()
	{
		Acc_No=101;
		Name="Yash";
		obj= new MyDate();
		
	}
	public Account(int acc, String nam, MyDate obj)
	{
		this.Acc_No=acc;
		this.Name=nam;
		this.obj = obj;
		
	}
	public String toString()
	{
		return "Account No :"+Acc_No+" Name is : "+Name+" Date: "+obj;
	}

}
