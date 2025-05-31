public class SingletonTest{
public static void main(String [] args){
	SingletonPractice u1= SingletonPractice.getInstance();
	u1.callingUser();
	SingletonPractice u2= SingletonPractice.getInstance();
	u2.callingUser();
}

}