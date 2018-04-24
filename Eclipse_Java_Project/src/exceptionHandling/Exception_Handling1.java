package exceptionHandling;
class Exception_Test extends Exception
{
	int div_err=0;
	Exception_Test(int err)
	{
		div_err=err;
	}
	
	void DivideError()
	{
		System.out.println("Dividend Is : "+div_err);
	}
}
public class Exception_Handling1 
{
	public static void main(String[] args) 
	{	
		try
		{
			int div=0;
			java.util.Scanner sc=new java.util.Scanner(System.in);
		
			System.out.println("Enter Value Of Divisor ");
			int divisor=sc.nextInt();
		
			System.out.println("Enter Value Of Dividend");
			int dividend=sc.nextInt();
		
			if(dividend==0)
			throw new Exception_Test(dividend);
			
			else
			{
				div=divisor/dividend;
				System.out.println("Division Is : "+div);
			}
		}
		
		catch(Exception_Test et)
		{		
			et.DivideError();
		}
	}
}
