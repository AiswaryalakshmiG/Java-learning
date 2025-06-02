public class FactoryPoducer{
public static ShapeFactory getFactory(String shape){
	if(shape.equalsIgnoreCase("2D")){
		return new Shape2DFactory();
	}
	else if(shape.equalsIgnoreCase("3D")){
		return new Shape3DFactory();
	}
	return null;
}
}