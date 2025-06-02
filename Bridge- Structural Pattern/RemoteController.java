abstract class RemoteController{
protected TV tv;
public RemoteController(TV tv){
this.tv=tv;
}
public abstract void onButtonPressed();
public abstract void offButtonPressed();
public abstract void volumeUp();
}