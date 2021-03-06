class NewThread implements Runnable
{
	Thread t;
	NewThread()
	{
		t=new Thread(this,"Demo Thread");
		System.out.println("Child thread : "+t);
		t.start();//start the thread
	}
	public void run(){
		try
		{
			for(int i=5;i>0;i--){
				System.out.println("Child Thread : "+i);
				Thread.sleep(50);
			}
		}
		catch(InterruptedException e){
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child Thread");
	}
}
public class multithread {
	public static void main(String args[]) {
		new NewThread();
		try{
			for(int i=5;i>0;i--){
				System.out.println("Main Thread : "+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main Thread Interrupted.");
		}
		System.out.println("Main Thread Exiting.");
	}
}