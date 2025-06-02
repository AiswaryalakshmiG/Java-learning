public class MobileMain{
public static void main(String [] args){
	Mobile m1= new Mobile.Builder("Samsung","snapdragon",8)
	.enableCamera()
	.enableBluetooth()
	.build();
	m1.showSpecs();
	System.out.println();
	Mobile m2= new Mobile.Builder("Realme","Mediatek",6)
	.build();
	m2.showSpecs();
}
}