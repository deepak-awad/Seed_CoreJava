package Day2;

public class Multiplymethodoverload {
	
	public void multiply(int a, int b)
	{
		System.out.println("Multiplication of a and b are: "+a*b);
	}
	public void multiply(float a, float b)
	{
		System.out.println("Multiplication of a and b are: "+a*b);
	}
	public void multiply(double a, double b)
	{
		System.out.println("Multiplication of a and b are: "+a*b);
	}
	public void multiply(int a, int b, int c)
	{
		System.out.println("Multiplication of a, b and c are: "+a*b*c);
	}
}
