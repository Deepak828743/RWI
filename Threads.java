package threadss;

public class Threads implements Runnable {
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		 Threads t=new  Threads();
		 Thread t1=new Thread(t);
		 t1.setName("deepak");
		 t1.start();

	}

}
