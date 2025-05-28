public class MethodOverRiding extends ParentMethodOverRiding {
	public static void main(String [] args){
		int a=3, b=2;
	    ParentMethodOverRiding parent= new ParentMethodOverRiding();
	    MethodOverRiding child = new MethodOverRiding();
		parent.calculation(a,b);
		child.calculation(a,b);
		
	}
		public int calculation(int a, int b){
				int result = a*b;
	     System.out.println("Child's Calculation is: " + result);
		 return result;
	}
	
}