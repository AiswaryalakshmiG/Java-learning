@FunctionalInterface
interface Calculator{
 public int add(int a, int b);
//public void rule1();
public static void rule2(){
	System.out.println("this is static method");
}
}