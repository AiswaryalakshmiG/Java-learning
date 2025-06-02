public class ShapeFactory{
public Shape getShape(String type){
	if(type.equalsIgnoreCase("Circle"))
		return new Circle();
	else if(type.equalsIgnoreCase("square"))
		return new Square();
	    return null;
}
}