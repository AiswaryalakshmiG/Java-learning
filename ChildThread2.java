public class ChildThread2 extends Thread{
public void run(){
	
	for(int i= 1;i<=5;i++){
		//Thread.yield();
		//try {
		     //  Thread.sleep(1000);
		    //}catch (InterruptedException e) {
			   //  Thread.currentThread().interrupt();
           // }
		System.out.println("child2 thread: " + i);
	}
}
}