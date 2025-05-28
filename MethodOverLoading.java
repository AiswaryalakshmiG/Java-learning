public class MethodOverLoading{
	public static void main(String[] args){
		int a=4, b=2, c= 6;
		MethodOverLoading calc = new MethodOverLoading();
		int result1=calc.add(a,b);
        int result2=calc.add(a,b,c);
        System.out.println("Sum of a and b is: " + result1);
        System.out.println("Sum of a,b and c is: " + result2);

	}
	public int add(int a , int b){
		int sum = a+b;
		return sum;
	}
	public int add(int a, int b, int c){
		int sum  = a+b+c;
        return sum;
	}
	
}