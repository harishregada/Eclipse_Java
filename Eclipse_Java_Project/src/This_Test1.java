class Test1
{
	Test1()
	{
		System.out.println("Test1...");
	}
}

class Test2 extends Test1
{
	Test2()
	{
		System.out.println("Test2...");
	}
}
public class This_Test1 
{
	public static void main(String[] args) 
	{
		Test2 obj2=new Test2();
		//Test1 obj1=new Test1();
	}

}
