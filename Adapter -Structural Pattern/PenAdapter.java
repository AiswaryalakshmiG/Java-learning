public class PenAdapter implements Pen{
PioletPen pp = new PioletPen();
public void write(String text){
	pp.mark(text);
}
}