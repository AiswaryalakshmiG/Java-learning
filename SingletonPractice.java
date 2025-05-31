public class SingletonPractice{
private static SingletonPractice instance;

private SingletonPractice(){
	System.out.println("hi");
}
	public static SingletonPractice getInstance() {
		   if(instance == null) {
           instance = new SingletonPractice();
	}
	 return instance;
}

public void callingUser(){
	System.out.println("calling User");
}

}


