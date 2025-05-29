import java.util.*;
public class HashMapPractice{
public static void main(String [] args){
	Map<String,Integer> marks = new HashMap<>();
	marks.put("Tamil", 96);
	marks.put("English",89);
	marks.put("Maths",89);
	marks.put("Science",97);
	marks.put("Soical",99);
	//System.out.println("Getting marks Based on Key value Social:" + marks.get("Social"));
	
	if(marks.containsKey("Tamil")){
		System.out.println("Tamil is present");
	}
}

}