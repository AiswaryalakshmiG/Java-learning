import java.util.LinkedList;
public class LinkedListPractice{
public static void main(String [] args){
	LinkedList<Integer> numbers = new LinkedList<Integer>();
	numbers.add(38);
	numbers.add(92);
	numbers.add(22);
	numbers.add(45);
	numbers.add(36);
	numbers.add(23);
	numbers.add(11);
	numbers.add(15);
System.out.println("LinkedList is: "+ numbers);

numbers.addFirst(1);
numbers.addLast(100);
System.out.println("After adding first and last index: "+ numbers);

int first = numbers.getFirst();
System.out.println("Index first is: "+ first);
int last = numbers.getLast();
System.out.println("Index last is: "+ last);

numbers.removeFirst();
numbers.removeLast();
System.out.println("After removing first and last index: "+ numbers);

}

}