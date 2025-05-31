public class MyThread {
public static void main(String [] args){
	ChildThread ct = new ChildThread();
	ChildThread2 ct2 = new ChildThread2();
	//System.out.println(ct.getState());
	ct.setName("Child Thread");
	System.out.println("Name of the thread is: "+ ct.getName());
	System.out.println("Id of the thread is: "+ ct.getId());
	//System.out.println(ct.getState());
	ct.start();
	ct2.start();
	//ct.setPriority(10);
	ct.interrupt();
	 try {
	ct.join();
	 } catch (InterruptedException e) {
          e.printStackTrace();
}		
	for(int i= 1;i<=5;i++){
		System.out.println("My thread: " + i);
	}
	//System.out.println(ct.getState());
}
}