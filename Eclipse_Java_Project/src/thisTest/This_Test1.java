package thisTest;
class Test
{
	Test()
	{
		this("Parameterized Constructor...");	//Calling Param.. Constructor
		System.out.println("Default Constructor...");
	}
	
	Test(String msg)
	{
		System.out.println(msg);
	}
}

public class This_Test1 
{
	public static void main(String[] args) 
	{
		Test obj=new Test();
	}

}
