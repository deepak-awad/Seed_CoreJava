package Day2;

public class Thhis {
	
	private int dd, mm, yy;
	
	public void init()
	{
		dd=10;
		mm=10;
		yy=2014;
	}
	public void print()
	{
		System.out.println(dd+"/"+mm+"/" + yy );
	}
	
	public static void main(String args[])
	{
		Thhis s= new Thhis();
		s.init();
		s.print();
	}

}
