package study;
class NewThread implements Runnable{
	String name ;
	Thread t;
	NewThread(String threadName){
		name = threadName;
		t= new Thread(this,name);
		System.out.println("New Thread: "+t);
		t.start();
	}
	public void run(){
		try{
			for(int i=5 ; i>0 ; i--){
				System.out.println(name + ": "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println(name+"Interrupted");
		}
		System.out.println(name + "Exiting");
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		NewThread ob1 = new NewThread("One");
		NewThread ob2 =new NewThread("Two");
		NewThread ob3 = new NewThread("Three");
		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
	}

}
