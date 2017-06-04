
public class Demo_multi_threading extends Thread{

		public void run()
		{
			System.out.println("run method called....");
			for (int i=0; i<20;i++){
			System.out.println("current thread : "+Thread.currentThread().getId()+"& i : "+i);
			}
		}
public static void main(String[] args) throws InterruptedException {
	Demo_multi_threading  mt = new Demo_multi_threading ();
	mt.start ();

		for (int i=0; i<80;i++)
		{
			Thread.sleep(30000);
			System.out.println("Other thread" +i);
		
	}}
}
