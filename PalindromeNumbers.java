public class PalindromeNumbers{
	public static void main (String [] args){
		int number = 7453, rem, rev = 0, count =0;
		System.out.println("The actual number is: " + number);
		while(number!=0){
			rem= number % 10;
			number = number /10;
			rev = rev * 10+rem;
			count++;
		}
		System.out.println("Palindrome Number is: " +rev);
	}
}