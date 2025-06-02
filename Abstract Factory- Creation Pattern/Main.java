public class Main{
public static void main(String [] args){
	ShapeFactory factory2D = FactoryPoducer.getFactory("2D");
	Shape2D shape2d = factory2D.get2DShape("circle");
	shape2d.draw();
	
	ShapeFactory factory3D = FactoryPoducer.getFactory("3D");
	Shape3D shape3d = factory3D.get3DShape("cube");
	shape3d.draw();
}
}