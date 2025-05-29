import java.util.ArrayList;
public class ArrayListPractice{
public static void main(String [] args){

ArrayList<String> names= new ArrayList<String>();
names.add("Aishu");
names.add("Sri");
names.add("Kavi");
names.add("Rose");
names.add("Devi");
names.add("Gobi");
names.add("Balaji");
names.add("viji");

System.out.println("ArrayList is: "+ names);

//add name using index
names.add(5, "Suji");
System.out.println("After adding index 5: "+ names);

//get name by index
String n3 = names.get(3);
System.out.println("index 3 is: "+ n3);

//replace name by index
System.out.println("Before replace index 5: "+ names.get(5));
names.set(5, "VishuSujitha");
System.out.println("After replace index 5: " + names);

//remove name by index
names.remove(2);
System.out.println("After removing index 2: " + names);

//remove name by value
names.remove("viji");
System.out.println("After removing viji in names: " + names);

//check the value is contains in names
boolean present = names.contains("Rose");
System.out.println("Rose is present in names: " + present);

System.out.print("Looping throw names: ");
for(String name:names){
	System.out.print(name+ " ");
}
System.out.println();

//checking size
int size = names.size();
System.out.println("Size of names is: " + size);

//isEmpty
boolean isEmpty = names.isEmpty();
System.out.println("The list is Empty: " + isEmpty);

//clear
names.clear();
System.out.println("After clear: " + names);
System.out.println("After clear the list is Empty: " + names.isEmpty());


}

}