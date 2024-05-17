package Day5;

public class FixedDepostAccount extends Account {
	
	protected int fd_no;
	
	public FixedDepostAccount()
	{
		fd_no = 10202;
	}
	public FixedDepostAccount(int ac, String nm, int no)
	{
		super(ac,nm);
		this.fd_no = no;
	}
	
	/*public String toString()
	{
		return super.toString()+" FD NO is :"+fd_no;
	}*/
	
	public String print()
	{
		
		return "Account no: "+accNo+" Name is: "+ name+" fd no is:"+fd_no;
	}

}
