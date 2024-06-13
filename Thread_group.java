package threadss;

public class Thread_group implements Runnable {
	public void run()
	{
		System.out.println(Thread.currentThread().isAlive());
	}
	 
	public static void main(String[] args) {
		Thread_group t=new  Thread_group();
		 Thread t1=new Thread(t);
		 t1.setPriority(8);
		 System.out.println(t1.getPriority());
     
	}

}
