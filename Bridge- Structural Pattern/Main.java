public class Main{
public static void main(String [] args){
	TV sony = new SonyTV();
	RemoteController rc = new Remote(sony);
	rc.onButtonPressed();
	rc.volumeUp();
	rc.offButtonPressed();
}
}