import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AddingElementsToCollections{
public static void main(String [] args){
	List<String> list1= new ArrayList<String>();
	list1.add("Aishu");
	list1.add("Sri");
	list1.add("Kavi");
	
	List<String> list2 = new ArrayList<String>();
	list2.add("Gobi");
	list2.add("Devi");
	
	test();
	Collections.addAll(list1, "Devi" , "Gobi" , "Rose");
	System.out.println(list1.contains("Rose"));
	
	System.out.print("List 1: " );
	for(int i= 0; i< list1.size();i++){
		System.out.print(list1.get(i)+" ");
	}
	
	
	System.out.println();
	
	 list1.remove(2);
	 System.out.println("List one After remove: " + list1);
	
	System.out.println("list1 contains all the element in list2: " + list1.containsAll(list2));
}


public static void test(String [] args){
	List<String> list1= new ArrayList<String>();
	list1.add("Aishu");
	list1.add("Sri");
	list1.add("Kavi");
	
}

}