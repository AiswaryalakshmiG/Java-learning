public class Calculate{
public static void main(String [] args){

	Calculator addition = (a, b) -> a+b; 
	int result = addition.add(5, 3);
	System.out.println("The sum is: " + result);
	 
	 //Calculator cc = ()->System.out.println("Hi");
     //cc.rule1();
	 
	 Calculator.rule2();
}
}