import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice{
public static void main(String [] args){
	Set<String> colors = new HashSet<String>();
	colors.add("Blue");
	colors.add("Red");
	colors.add("Black");
	colors.add("Pink");
	colors.add("White");
	
	
	System.out.println("Colors: " + colors);
	System.out.println("Size of Colors: " + colors.size());
	colors.add("Black");
	System.out.println("After adding duplicate: " + colors +  " Size is:" + colors.size());

	 Iterator<String> clr = colors.iterator();
	 while(clr.hasNext()){
		 String i = clr.next();
		
	 //System.out.println(clr.next());
	 }
	System.out.println(colors);
	
}
}