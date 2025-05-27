public class StringReverse{
public static void main (String [] args){
	String originalStr = "Java";
	String reverseStr = "";
	System.out.println("Original String: " +originalStr);
	
	for(int i =0; i<originalStr.length();i++){
		reverseStr = originalStr.charAt(i) + reverseStr;
	}
	System.out.println("Reversed String: " + reverseStr);
}
}