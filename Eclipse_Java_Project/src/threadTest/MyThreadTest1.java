package threadTest;

public class MyThreadTest1 
{
	public static void main(String[] Args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		Thread t1=new Thread();
		
		System.out.println("Enter A Name For Thread1 : ");
		String tname1=sc.nextLine();
		
		t1.setName(tname1);
		System.out.println("Name Of Thread1 : "+t1.getName());
	}
}
