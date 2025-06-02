public class MobileMain{
public static void main(String [] args){
	Mobile m1= new Mobile("Samsung","snapdragon",8);
	System.out.println("Original Mobile: ");
	m1.showSpecs();
	System.out.println();
	Mobile m2= m1.clone();
	System.out.println("Clone Mobile: ");
	m2.showSpecs();
}
}