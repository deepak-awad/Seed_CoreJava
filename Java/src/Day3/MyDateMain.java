package Day3;

public class MyDateMain {
	
	public static void main(String args[])
	{
	MyDate d[] = new MyDate[2];
	d[0] = new MyDate(10,02,2012);
	d[1] = new MyDate(10,02,2014);
	
	System.out.println(d[0]);
	System.out.println(d[1]);
	
	  MyDate.swap(d);
	  
	System.out.println("-----");
	System.out.println(d[0]);
	System.out.println(d[1]);
	}

}
