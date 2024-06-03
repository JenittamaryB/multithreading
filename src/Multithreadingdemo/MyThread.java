package Multithreadingdemo;

public class MyThread extends Thread 
{	
public void run() //it is default we should override that
{
	for(int i=1;i<=5;i++)
	{
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{	
			e.printStackTrace();
		}
		System.out.println("myThread "+i);
	}
}
}
