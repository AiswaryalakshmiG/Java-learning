public class Remote extends RemoteController{
public Remote(TV tv){
	super(tv);
}

public void onButtonPressed(){
	tv.on();
}

public void offButtonPressed(){
	tv.off();
}

public void volumeUp(){
	tv.setVolume(10);
}
}