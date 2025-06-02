public class SonyTV implements TV{
public void on(){
	System.out.println("Sony TV is ON");
}

public void off(){
	System.out.println("Sony TV is OFF");
}

public void setVolume(int level){
	System.out.println("Volume is set to: " + level );
}
}