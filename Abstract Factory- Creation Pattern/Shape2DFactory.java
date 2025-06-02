public class Shape2DFactory implements ShapeFactory{
public Shape2D get2DShape(String shapeType){
	if(shapeType.equalsIgnoreCase("Circle"))
		return new Circle2D();
	else if(shapeType.equalsIgnoreCase("square"))
		return new Square2D();
	    return null;
}
public Shape3D get3DShape(String shapeType){
	return null;
}
}