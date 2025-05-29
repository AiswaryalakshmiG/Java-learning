import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortingCollection{
public static void main(String [] args){
	List<Integer> list1 = new ArrayList<Integer>();
	list1.add(5);
	list1.add(3);
	list1.add(7);
	list1.add(2);
	
	Collections.addAll(list1, 2,4,6,1);
	System.out.println("Before Sorting: "+ list1);
	//Sorting
	Collections.sort(list1);
	for(int i=0; i<list1.size();i++){
	//System.out.print(list1.get(i)+ " ");
	
	}
	System.out.println("After Sorting: " + list1);
	
	// Sorting according to reverse ordering
	 Collections.sort(list1,Collections.reverseOrder());
	 for(int i=0; i<list1.size();i++){
	 }
	 System.out.println("After Sorting in reverse order: " + list1);
	 
	 
	 
	 //copy list 2 in list 1
	 
	 List<Integer> list2 =new ArrayList<Integer>();
	 
	 list2.add(11);
	 list2.add(12);
	 
	 Collections.addAll(list2,13,14,15,16sn);
	 System.out.println("List 2 is: "+ list2);
	 
	 Collections.copy(list1,list2);
	  System.out.println("Now the List 1 is: "+ list1);
	  
	 
}
}