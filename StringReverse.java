public class StringReverse{
public static void main (String [] args){
	String originalStr = "Java";
	String reverseStr = "";
	String str= "Hello   World";
	String words = "One Two Three Four";
	int countWords = words.split(" ").length;
    System.out.println("Todal words: "+countWords);
	
	
	System.out.println("Before removing space: " + str);
	String removeSpace= str.replace(" ","");
	System.out.println("After removing space: "+ removeSpace);
	System.out.println("Upper Case: "+removeSpace.toUpperCase());
	System.out.println("Lower Case: "+removeSpace.toLowerCase());
	int count =originalStr.length();
	System.out.println("Size of the String is: " + count);
	System.out.println("Original String: " +originalStr);
	for(int i =0; i<originalStr.length();i++){
		reverseStr = originalStr.charAt(i) + reverseStr;
	}
	
	System.out.println("Reversed String: " + reverseStr);
	
	if(originalStr.equals(reverseStr)){
		System.out.println("Plaindrome");
	}else{
		System.out.println("Not a Plaindrome");
	}
}
}
