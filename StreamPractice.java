import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class StreamPractice{
public static void main(String [] args){
	List<Integer> list = new ArrayList<Integer>();
	list.add(20);
	list.add(68);
    list.add(72);
	list.add(96);
	list.add(12);
	list.add(90);
	list.add(23);
	list.add(54);
	list.add(31);
	list.add(35);
	Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;
	boolean isEven = isEvenPredicate.test(10);
        System.out.println("10Is the number even: " + isEven);
		System.out.println();
	list
	.stream()
	.sorted()
	.filter(n -> n%2 == 0)
	.map(n -> n*2)
	.limit(5)
	.skip(1)
	
	//.forEach(no->System.out.println(no));
	.forEach(System.out::println);
	System.out.println();
	
	List<String> list2 = new ArrayList<String>();
	list2.add("red");
	list2.add("blue");
	list2.add("green");
	list2.add("yellow");
	list2.add("black");
	list2.add("brown");
	list2.add("white");
	list2.add("red");
	list2.add("yellow");
	list2.add("brown");
	list2.add("black");

	list2
	.stream()
	.distinct()
	.filter(color-> color.startsWith("b"))
	.map(word ->word.toUpperCase())
	.forEach(System.out::println);
	
	
	System.out.println();
	
	Map<String,Integer> list3 = new HashMap<String,Integer>();
	list3.put("aishu",101);
	list3.put("sri",107);
	list3.put("kavi",105);
	list3.put("Manu",103);
	list3.put("Rose",106);
	
	list3
	.keySet()
	.stream()
	.collect(Collectors.toList())
	.forEach(System.out::println);
}
}