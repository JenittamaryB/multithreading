package Multithreadingdemo;

public class ThreadDemo 
{
	public static void main(String[] args) 
	{
		MyThread mt=new MyThread();// thread used to run multiple task concurrently
		System.out.println(mt.getState());
		mt.start();
		System.out.println(mt.getState());
		mt.setName("batman");
		System.out.println(mt.getName());
		
		ThreadDemo m=new  ThreadDemo();
		m.display();
		System.out.println(mt.MIN_PRIORITY);
		System.out.println(mt.getState());
		
		MyThread mt1=new MyThread();
		System.out.println(mt1.getState());
		mt1.start();
		System.out.println(mt1.getState());
       System.out.println(mt1.MAX_PRIORITY);
	}
	public void display()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Threaddemo "+i);
		}
	}

}
