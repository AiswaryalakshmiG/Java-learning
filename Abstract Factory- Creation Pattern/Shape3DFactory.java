public class Shape3DFactory implements ShapeFactory{
public Shape3D get3DShape(String shapeType){
	if(shapeType.equalsIgnoreCase("Sphere"))
		return new Sphere3D();
	else if(shapeType.equalsIgnoreCase("Cube"))
		return new Cube3D();
	    return null;
}
public Shape2D get2DShape(String shapeType){
	return null;
}
}