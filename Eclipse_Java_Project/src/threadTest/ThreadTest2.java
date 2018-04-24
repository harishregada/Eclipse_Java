package threadTest;

public class ThreadTest2 
{
	public static void main(String[] Args)
	{
		Thread t1=new Thread();
		Thread t2=new Thread();
		
		System.out.println("\n\n-----Thread Name-----");
		t1.setName("One");
		t2.setName("Two");
		
		System.out.println("T1 : "+t1.getName());
		System.out.println("T2 : "+t2.getName());
		
		System.out.println("\n\n-----Priority-----");
		t1.setPriority(1);
		t2.setPriority(5);
		
		System.out.println("T1 : "+t1.getPriority());
		System.out.println("T2 : "+t2.getPriority());
		
		System.out.println("\n\n-----State-----");
		System.out.println("T1 : "+t1.getState());
		System.out.println("T1 : "+t2.getState());
		
	}
}
